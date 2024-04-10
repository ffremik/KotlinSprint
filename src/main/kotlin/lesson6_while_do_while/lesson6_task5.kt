package lesson6_while_do_while
/*
В программе нужно использовать
1)Переменные var или val (Любой тип) или const
2)Использование арифметики +-/%* (На свой выбор)
3)Использовавать строковый шаблон $, ${}
4)Применить операторы сравнения > < <= >= == ! (на свой выбор)
5)Использовать if/else if/else (на свой выбор)
6)Использование while/do while (на свой выбор)

 */
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