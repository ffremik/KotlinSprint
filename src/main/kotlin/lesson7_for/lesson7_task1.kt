package lesson7_for

/*
В программе обязательно нужно использовать
1)Использовать for

Бонусные задания
1)Переменные var или val (Любой тип) или const
2)Использование арифметики +-/%* (На свой выбор)
3)Использовавать строковый шаблон $, ${}
4)Применить операторы сравнения > < <= >= == ! (на свой выбор)
5)Использовать if/else if/else (на свой выбор)
6)Использование while/do while (на свой выбор)
7)Использовать continue или break
 */
fun main() {
    val hiddenWord = "азбука"
    var isTrue = false

    println("Вам необходимо угадать слово состоящие из ${hiddenWord.length} букв")

    while (!isTrue) {
        println("Введите 6 любых букв или слово из 6 букв:")
        val userWord = readln()
        if (userWord.length <6) {
            println("Вы ввели меньше 6 букв!")
        }else if (hiddenWord.lowercase() == userWord.lowercase()) {
            println("Поздравляю, вы угадали слово. Было загадано $hiddenWord")
            isTrue = true
        } else {
            for (i in userWord.indices) {
                for (n in hiddenWord.indices) {
                    if (userWord[i] == hiddenWord[n]) {
                        println("Вы угадали букву ${userWord[i]}, она на ${n + 1} позиции ")
                    }
                }
            }
        }
    }

}