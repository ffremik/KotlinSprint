package lesson10_fun

fun main() {
    val baseUser = mutableMapOf("user1" to "password1", "user2" to "password2")
    val isTrue = false

    while (!isTrue) {
        println("войти/регистрация")
        val userReply = readln()
        if (userReply == "войти"){
            val user = authorization(baseUser)
            if (user) {
                registration(baseUser)
            }else{
                println("Добро пожаловать!")
                break
            }
        }else{
            registration(baseUser)
        }

    }

}


fun authorization(base: Map<String, String>): Boolean {
    var userLogin: String
    var userPassword: String
    val isAuthorization = false
    var userReply: String
    var isRegistration = false
    var count = 3

    isAuthorization@ while (!isAuthorization) {
        println("Введите логин: ")
        userLogin = readln()
        if (userLogin in base.keys) {
            while (!isAuthorization) {
                println("Введите пароль")
                userPassword = readln()
                if (userPassword == base[userLogin]) {
                    println("Вы успешно авторизавались!")
                    break@isAuthorization
                } else {
                    count--
                    println("Пароль неверный! У вас осталось $count попытки")
                    if (count <= 0) {
                        println("В доступе отказано!")
                        count = 3
                        break
                    }
                }
            }
        } else {
            println("Такой логин не существует!")
            println("Хотите пройти регистрацию? да/нет")
            userReply = readln()
            if (userReply == "да") {
                isRegistration = true
                break
            }
        }
    }
    return isRegistration
}

fun registration(base: MutableMap<String, String>):MutableMap<String, String> {
    while (true) {
        println("Введите желаемый логин:")
        val userLogin = readln()
        if (userLogin !in base.keys) {
            println("Введите желаемый пароль:")
            val userPassword = readln()
            base.put(userLogin, userPassword)
            println("Вы успешло прошли регистрацию!")
            break
        } else {
            println("Такой логин уже занят!")
        }
    }
    return base
}