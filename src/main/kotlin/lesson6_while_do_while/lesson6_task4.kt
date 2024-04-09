package lesson6_while_do_while

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(0, 1000)
    var isRight = false
    var userNumber: Int
    var count = 0

    println("Необходимо угадать загаданное число от 0 до 1000, потратив меньше кол-во попыток")
    while (!isRight) {
        println("Введите ваше число: ")
        userNumber = readln().toInt()
        if (number == userNumber) {
            println("Поздравляю, вы отгадали число за $count попыток. Загаданное число было $number")
            isRight = true
        } else if (number > userNumber) {
            println("Нет, вы не угадали, число которое загаданно оно больше")
            count++
        } else {
            println("Нет, вы не угадали, число которое загаданно оно меньше")
            count++
        }
    }

}