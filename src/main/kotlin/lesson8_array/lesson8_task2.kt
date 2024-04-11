package lesson8_array

fun main() {
    var isTrue = false
    var userLife = 3
    val listItems = arrayOf("Помидор", "Книга", "Телефон", "Тарелка", "Мышка")

    println("Мини игра: какое слово было загаданно? Кол-во жизней:$userLife")

    while (!isTrue) {
        val gameChoice = listItems[(Math.random() * listItems.size).toInt()]
        var count = 1
        for (i in listItems) {
            print("${count++})$i ")
            Thread.sleep(1000)
        }
        println()
        while (!isTrue) {
            println("Введите номер: ")
            val userReplyInt = readln().toInt()
            if (userReplyInt <= listItems.size) {
                if (listItems[userReplyInt - 1] == gameChoice) {
                    println("Поздравляю, вы угадали слово. Было загаданно $gameChoice, Кол-во жизней $userLife")
                    userLife = 3
                    println("Хотите попробовать ещё? да/нет")
                    val userReply = readln()
                    if (userReply == "нет") {
                        isTrue = true
                    } else {
                        break
                    }
                } else {
                    println("Вы не угадали, Кол-во жизней:${--userLife}")
                    if (userLife <= 0) {
                        println("Вы проиграли!")
                        userLife = 3
                        println("Хотите попробовать ещё? да/нет")
                        val userReply = readln()
                        if (userReply == "нет") {
                            isTrue = true
                        } else {
                            break
                        }
                    }
                }
            } else {
                println("Нету такова значения")
            }
        }

    }
}