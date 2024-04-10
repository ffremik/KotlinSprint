package lesson7_for

import kotlin.random.Random

fun main() {
    var ironResource = 0
    var treeResource = 0
    var foodResource = 0
    val userName: String
    var userReply = ""
    val userTime: Int
    var isTrue = false

    println("Приветствую тебя путник в этих краях, как тебя звать ?")
    userName = readln()
    println("Очень приятно, $userName, куда пойдешь работать ? У нас есть свободные вакансии на шахте, лесопилке, ферме")
    while (!isTrue) {
        userReply = readln()
        when (userReply.lowercase()) {
            "лесопилка" -> {
                println("Хорошо, вот тебе топор и карта как дойти")
                println("$userName отправил на лесопилку")
                isTrue = true
            }

            "шахта" -> {
                println("Хорошо, вот тебе кирка и карта как дойти")
                println("$userName отправил на шахту")
                isTrue = true
            }

            "ферма" -> {
                println("Хорошо, вот тебе зерно и карта как дойти")
                println("$userName отправил на ферму")
                isTrue = true
            }

            else -> {
                println("У нас только шахта/лесопилка/ферма")
            }
        }
    }
    println("$userName, дошёл до $userReply")
    println("Сколько часов хотите работать ?")
    userTime = readln().toInt()

    for (i in 1..userTime) {
        println("Было отработано $i часов из $userTime")
        when (userReply.lowercase()) {
            "лесопилка" -> {
                treeResource += Random.nextInt(1, 25)
                println("Было добыло $treeResource дерева")
            }

            "шахта" -> {
                ironResource += Random.nextInt(1, 10)
                println("Было добыло $ironResource железа")
            }

            "ферма" -> {
                foodResource += Random.nextInt(1, 20)
                println("Было добыло $foodResource еды")
            }
        }
        if (i >= 12) {
            println("$userName, после 12 часов работы вы устали и упали без сил")
            Thread.sleep(1000)
            println("Вы проснули утром без вещей")
            break
        } else if (i == userTime) {
            println("Вы завершили свою работу и отправились домой!")
        }
        Thread.sleep(1000)
    }
}