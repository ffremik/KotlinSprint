package lesson8_array

import kotlin.random.Random

fun main() {
    val options = arrayOf("Орёл", "Решка")
    val isGameOver = false
    var countUser = 0
    var countGame = 0

    println("Мини игра: Орёл/Решка\nВам предстоит угадать, что выбрал компьютер. \nИгра идёт до 3 побед")

    while (!isGameOver) {
        val gameOption = options[Random.nextInt(0, 2)]

        if (countUser == 3) {
            println("Поздравляю, вы набрали 3 победы!")
            println("Хотите повторить? да/нет")
            countUser = 0
            countGame = 0
            val userReply = readln()
            if (userReply == "нет") {
                break
            } else {
                println("Хорошо. Продолжим!")
            }
        } else if (countGame == 3) {
            println("К сожалению вы проиграли! Вы набрали $countUser")
            println("Хотите повторить? да/нет")
            countUser = 0
            countGame = 0
            val userReply = readln()
            if (userReply == "нет") {
                break
            } else {
                println("Хорошо. Продолжим!")
            }
        }

        println("Какой ваш выбор? нужно написать")
        for (i in options) {
            println("$i ")
        }
        val userOptions = readln()

        if (userOptions in options) {
            if (userOptions == gameOption) {
                println("Поздравляю, вы угадали, было выбрано $gameOption")
                countUser++
                Thread.sleep(1000)
                println("Ваш счет: $countUser, счет компьютера: $countGame")
            } else {
                println("Вы проиграли, было выбрано $gameOption")
                countGame++
                Thread.sleep(1000)
                println("Ваш счет: $countUser, счет компьютера: $countGame")
            }
        } else {
            println("Ваш ввод некорректный")
            Thread.sleep(1000)
        }
    }

}