package lesson6_while_do_while
    const val IS_LOADED = 100
fun main() {
    var count = 0

    println("Приветствую, загрузить данные? да/нет")
    val userResponse = readln()

    if (userResponse.lowercase() == "да") {
        while (count < IS_LOADED) {
            println("Загрузка данных $count")
            count += 10
            if (count == 100) {
                println("Загрузка данных успешно прошла, вы можете запустить игру")
            }
            Thread.sleep(1000)
        }
    } else {
        println("Запустить игру невозможно!")
    }
    println("Запустить игру? да/нет")
    val userResponseSecond = readln()

    if (userResponseSecond == "да" && count == IS_LOADED) {
        var coun = 0
        while (coun < IS_LOADED) {
            println("Запуск игры $coun")
            coun += 10
            if (coun == IS_LOADED) {
                println("Игра запустилась!")
            }
            Thread.sleep(1000)
        }
    } else {
        println("Закрываю лаунчер")
    }


}