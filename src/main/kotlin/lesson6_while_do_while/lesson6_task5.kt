package lesson6_while_do_while

import kotlin.random.Random

fun main() {
    var dayNumber = Random.nextInt(1, 10)
    val dayDelivered = 0
    var isArrived = false

    while (!isArrived) {
        println("Ваша посылка в пути, до прибытия в пункт выдачи осталось $dayNumber дней")
        if (dayNumber == dayDelivered) {
            println("Ваша доставка прибыла в пункт назначения. Желаете заказ курьера до дома? да/нет")
            val userReply = readln()
            if (userReply == "да") {
                println("Через пару мин доставка будет у вашего дома. Всего хорошего")
                isArrived = true
            } else {
                println("Ждем в пунке выдачи")
                isArrived = true
            }
        } else if (dayNumber > dayDelivered) {
            Thread.sleep(1000)
            dayNumber -= 1
        }
    }
    println("Пользователь забрал посылку")
}