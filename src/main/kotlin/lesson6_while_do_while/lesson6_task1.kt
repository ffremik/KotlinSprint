package lesson6_while_do_while

import kotlin.random.Random

fun main() {
    var count = 5
    val numberFirst = Random.nextInt(0, 50)
    val numberSecond = Random.nextInt(0, 50)

    println("Ваша задача угадать 2 числа от 0 до 50, введите числа по очереди:")
    val userNumberFirst = readln().toInt()
    val userNumberSecond = readln().toInt()

    if ((numberFirst == userNumberFirst || numberFirst == userNumberSecond) && (numberSecond == userNumberSecond || numberSecond == userNumberFirst)) {
        println("Поздравляю, вы отгадали все 2 числа, загаданные числа были: $numberFirst, $numberSecond")
        println("Хотели бы принять участие в супер игре? да/нет")
        val userResponse = readln()

        if (userResponse.lowercase() == "да") {
            println("Пожалуйста, введите ваше имя для принятие участвие в супер игре:")
            val userName = readln()

            while (count > 0) {
                println("Супер игра начнется через ${--count}")
                Thread.sleep(1000)
            }
            val numberThree = Random.nextInt(0, 25)
            println("Вам необходимо угадать ещё одно число от 0 до 25, введите это число:")
            val userNumberThree = readln().toInt()

            when (numberThree) {
                userNumberThree -> println("Поздравляю!!!, $userName, победитель супер игры. Вы сумели отгадать 3 число, это число было $userNumberThree ")
                else -> {
                    println("$userName, Нам очень жаль, но вы не супели угадать, но т.к вы хорошо шли, у вас будет ещё одна попытка")
                    println("Но помните, это ваш последний шанс, введите ваше число: ")
                    val lastNumber = readln().toInt()

                    if (lastNumber == numberThree) {
                        println("$userName, У вас получилось отгадать число с 2 попытки, Поздравляю!! Вы забираете дополнитель приз")
                    } else {
                        println("$userName, К сожелению, у вас не вышло отгадать число, загаданное число было: $numberThree")
                    }
                }
            }
        }else{
            println("Вы отказались от супер игры! загаданные числа были $numberFirst, $numberSecond")
        }
    } else if ((numberFirst == userNumberFirst || numberFirst == userNumberSecond) || (numberSecond == userNumberSecond || numberSecond == userNumberFirst)) {
        println("Поздравляю, вы отгадали 1 число, загаданные числа были: $numberFirst, $numberSecond")
    } else {
        println("Вы проиграли: загаданные числа были $numberFirst, $numberSecond")
    }
}