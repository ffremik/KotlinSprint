package lesson5

import kotlin.random.Random

fun main() {
    val correctNumberFirst = Random.nextInt(0, 42)
    val correctNumberSecond = Random.nextInt(0, 42)
    val correctNumberThird = Random.nextInt(0, 42)
    val correctNumber = listOf(correctNumberFirst, correctNumberSecond, correctNumberThird)

    val sizeCorrectNumber: Int
    val message: String

    println("Необходимо угадать три числа от 0 до 42. Введите числа по очереди:")
    val userNumberFirst = readln().toInt()
    val userNumberSecond = readln().toInt()
    val userNumberThird = readln().toInt()

    val userNumber = listOf(userNumberFirst, userNumberSecond, userNumberThird)
    sizeCorrectNumber = userNumber.intersect(correctNumber).size

    when (sizeCorrectNumber) {
        1 -> message = "Вы угадали одно число и получаете утешительный приз. Загаданные числа $correctNumber"
        2 -> message = "Вы угадали два числа и получаете крупный приз. Загаданные числа были $correctNumber"
        3 -> message = "Вы угадали все числа и выиграли джекпот: Загаданные числа были $correctNumber"
        else -> message = "Вы проиграли. Загаданные числа: $correctNumber"
    }
    println(message)
}