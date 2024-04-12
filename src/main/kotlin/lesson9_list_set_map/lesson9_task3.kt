package lesson9_list_set_map

fun main() {
    val baseUser: MutableMap<String, String> = mutableMapOf("dsa" to "dsra")
    var userReply: String
    var userLogin: String
    var userPassword: String
    var count = 0
    var isCorrectPassword = false
    var isTrue = false


    while (!isTrue) {
        println("Войти в аккаунт или пройти регистрацию?  войти/регистрация")
        userReply = readln()
        if (userReply.lowercase() == "войти") {
            println("Введите ваш логин: ")
            userLogin = readln()
            if (userLogin in baseUser.keys) {
                pas@ while (!isCorrectPassword) {
                    for (i in baseUser.keys) {
                        if (userLogin == i) {
                            println("Введите пароль: ")
                            userPassword = readln()
                            if (userPassword == baseUser[i]) {
                                println("Вы успешно авторизовались!")
                                isTrue = true
                                isCorrectPassword = true
                            } else {
                                println("Ваш пароль неверный, попробуйте ещё раз!")
                                count++
                                if (count >= 3) {
                                    println("Вы привысели кол-во попыток. Попробуйте чуть позже!")
                                    break@pas
                                }
                            }
                        }
                    }
                }
            } else {
                println("Такова аккаунта нету. Хотите пройти регистрацию? да/нет")
                userReply = readln()
                if (userReply == "да") {
                    println("Придумайте себе логин: ")
                    userLogin = readln()
                    if (userLogin !in baseUser.keys) {
                        println("Придумайте пароль: ")
                        userPassword = readln()
                        baseUser.put(userLogin, userPassword)
                        println("Вы успешно создали аккаунт!")
                    } else {
                        println("Такой логин уже занят!")
                    }
                }
            }
        } else {
            println("Придумайте себе логин: ")
            userLogin = readln()
            if (userLogin !in baseUser.keys) {
                println("Придумайте пароль: ")
                userPassword = readln()
                baseUser.put(userLogin, userPassword)
                println("Вы успешно создали аккаунт!")
            } else {
                println("Такой логин уже занят!")
            }
        }
    }
}