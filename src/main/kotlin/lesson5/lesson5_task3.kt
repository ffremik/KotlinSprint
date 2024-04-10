package lesson5

fun main() {
    val correctNumberFirst = 5
    val correctNumberSecond = 10
    val message: String

    println("Необходимо угадать два числа от 0 до 42. Введите числа по очереди:")
    val userNumberFirst = readln().toInt()
    val userNumberSecond = readln().toInt()

    if ((correctNumberFirst == userNumberFirst || correctNumberFirst == userNumberSecond) && (correctNumberSecond == userNumberFirst || correctNumberSecond == userNumberSecond)) {
        message = "Вы выиграли главный приз. Загаданные числа были $correctNumberFirst, $correctNumberSecond"
    } else if ((correctNumberFirst == userNumberFirst || correctNumberFirst == userNumberSecond) || (correctNumberSecond == userNumberFirst || correctNumberSecond == userNumberSecond)) {
        message = "Вы выиграли утешительный приз. Загаданные числа были $correctNumberFirst, $correctNumberSecond"
    } else {
        message = "Вы проиграли. Загаданные числа были $correctNumberFirst, $correctNumberSecond"
    }

    println(message)

}