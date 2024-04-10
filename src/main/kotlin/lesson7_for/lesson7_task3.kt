package lesson7_for

import kotlin.random.Random

fun main() {
    var userReplyNumber: Int
    var userReplyMessage: String
    var isTrue = false

    println("Введите свой возвраст:")

    while (!isTrue) {
        userReplyNumber = readln().toInt()
        if (userReplyNumber >= 18) {
            println("Добро пожаловать..\nСкоро будет загрузка данных")
            for (i in 1..100 step Random.nextInt(1, 10)) {
                println("Загрузка завершена на $i")
                Thread.sleep(1000)
                if (i == 55) {
                    println("Произошла ошибка загрузки...\n хотите повторить? да/нет")
                    userReplyMessage = readln()
                    if (userReplyMessage.lowercase() == "да") {
                        println("Новая попытка загрузки")
                    } else {
                        break
                    }
                } else if (i >= 95) {
                    Thread.sleep(1500)
                    println("Загрузка завершена..")
                    isTrue = true
                    break
                }else {
                    println("Неудачная попытка")
                }
            }
        }

    }


}