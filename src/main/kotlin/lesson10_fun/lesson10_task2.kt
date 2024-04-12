package lesson10_fun

fun main() {
    val choice = arrayOf("камень", "ножницы", "бумага")
    var isGameOver = false

    while (!isGameOver) {
        val choiceGameRandom = gameRandomChoice(choice)
        val userChoice = userChoice(choice)
        resultGame(userChoice, choiceGameRandom)
        println("Хотите попробовать ещё? да/нет")
        val userReply = readln()
        if (userReply == "нет"){
            isGameOver = true
        }
    }
}

fun gameRandomChoice(choice: Array<String>) = choice[(choice.size * Math.random()).toInt()]

fun userChoice(choice: Array<String>): String {
    var userReply = ""
    var isUserChoice = false

    while (!isUserChoice) {
        println("Введите ваш выбор")
        for (i in choice) {
            print("$i ")
        }
        println()
        val userReplyChoice = readln()
        if (userReplyChoice.lowercase() in choice) {
            isUserChoice = true
            userReply = userReplyChoice
        } else {
            println("Неверный ввод!")
        }

    }
    return userReply
}

fun resultGame(userChoice: String, gameChoice: String) {
    if (userChoice == gameChoice) {
        println("У вас ничья! \nВы выбрали:$userChoice, Компьютер выбрал:$gameChoice")
    } else if (userChoice.lowercase() == "камень" && gameChoice.lowercase() == "ножницы"
        || userChoice.lowercase() == "бумага" && gameChoice.lowercase() == "камень"
        || userChoice.lowercase() == "ножницы" && gameChoice.lowercase() == "бумага"
    ) {
        println("Вы победили! \nВы выбрали:$userChoice, Компьютер выбрал:$gameChoice")
    } else {
        println("Вы проиграли! \nВы выбрали:$userChoice, Компьютер выбрал:$gameChoice")
    }

}