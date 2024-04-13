package lesson10_fun

fun main() {
    val choiceList = listOf("Орёл", "Решка")
    var isGameOver = false
    var userReply: String

    println("Необходимо угадать Орёл/Решка")
    while (!isGameOver) {
        println("Введите ваш выбор!:")
        for (i in choiceList) {
            print("$i ")
        }
        println()
        val userChoice = readln()
        if (userChoice in choiceList) {
            resultGame(userChoice, choiceGame(choiceList))
            println("Будете ещё играть? да/нет")
            userReply = readln()
            if (userReply == "нет") {
                isGameOver = true
            }
        } else {
            println("Ваш выбор неправильный!")
        }
    }
}


fun choiceGame(listChoice: List<String>): String {
    val randomChoice = listChoice.random()
    return randomChoice
}


private fun resultGame(user: String, game: String) {
    if (user == game) {
        println("Поздравляю, вы угадали ")
    } else {
        println("Вы проиграли, было выбрано $game ")
    }
}