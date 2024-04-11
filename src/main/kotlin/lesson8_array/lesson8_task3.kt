package lesson8_array

fun main() {
    val word = arrayOf("А", "З", "Б", "У", "К", "А")
    val displayWord = arrayOf("*", "*", "*", "*", "*", "*")
    var isTrue = false
    var count = 0

    println("Мини игра: угадай слово, необходимо вводить по 1 буквы и угадать cлово ")
    while (!isTrue) {
        if (displayWord.contentEquals(word)) {
            println("Вы отгадали слово. Кол-во попыток $count.  Было загаданно: ")
            for (i in word) {
                print(i)
            }
            isTrue = true
        } else {
            print("Введите букву\n")
            val userReply = readln()
            if (userReply.uppercase() in word) {
                for (i in word.indices) {
                    if (word[i] == userReply.uppercase()) {
                        displayWord[i] = userReply.uppercase()
                    }
                }
                println("Вы отгадали букву $userReply")
                for (n in displayWord) {
                    print(n)
                }
                println()
            } else {
                count++
                println("Такой буквы нет")
            }
        }
    }
}