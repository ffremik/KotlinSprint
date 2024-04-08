package lesson5

fun main() {
    val correctNumberFirst = 5
    val correctNumberSecond = 10
    val userNumberFirst: Int
    val userNumberSecond: Int
    var message: String

    println("Необходимо угадать два числа от 0 до 42. Введите числа по очереди:")
    userNumberFirst = readLine()!!.toInt()
    userNumberSecond = readLine()!!.toInt()

    if (userNumberFirst == correctNumberFirst || userNumberFirst == correctNumberSecond) {
        message = "Вы выиграли утешительный приз. Загаданные числа $correctNumberFirst и $correctNumberSecond"
        if (userNumberSecond == correctNumberFirst || userNumberSecond == correctNumberSecond) {
            message = "Вы выиграли главный приз. Загаданные числа $correctNumberFirst и $correctNumberSecond"
        }
    } else {
        message = "Вы проиграли. Загаданные числа $correctNumberFirst и $correctNumberSecond"
    }

    println(message)

}