package lesson5

fun main() {
    val num1 = 5
    val num2 = 10
    val userResponse: Int
    val isRight: Boolean

    println("Для входа в приложение необходимо доказать, что вы не бот.\nДля этого необходимо решить пример")
    println("Сколько будет $num1 + $num2?")
    userResponse = readln().toInt()

    isRight = userResponse == num1 + num2

    if (isRight){
        println("Добро пожаловать!")
    }else {
        println("Доступ запрещен!")
    }
}