package lesson6_while_do_while

fun main() {
    var count = 10

    do {
        println("Реклама будет идти ещё ${count--} секунд")
        Thread.sleep(1000)
        if (count == 5) {
            println("Вы хотите пропустить рекламу? да/нет")
            val userResponse = readln()
            if (userResponse == "да") {
                println("Вы пропустили рекламу")
                count = 0
            }
        }
    } while (count > 0)
    println("Приветствую тебя пользователь, как твоё имя?")
    val userName = readln()

    println("$userName, добро пожаловать. Сколько тебе лет?")
    val ageUser = readln().toInt()

    if (ageUser > 18) {
        println("Доступ к сайту разрешен")
    } else {
        println("Извини, но тебе доступ запрещен")
    }

}