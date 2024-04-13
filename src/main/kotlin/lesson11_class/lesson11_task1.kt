package lesson11_class

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    val nameDog: String
    val ageDog: Int
    var count = 1
    val baseParty: MutableList<Dog> = mutableListOf(Dog("milka", 6), Dog("al", 10))

    println("Хотите принять участвие в выставке собак? да/нет")
    val userReply = readln()
    if (userReply == "да") {
        println("Введите имя вашей собаки")
        nameDog = readln()
        println("Введите кол-во лет вашей собаки")
        ageDog = readln().toInt()
        baseParty.add(Dog(nameDog, ageDog))
        println("Вы были добавлены как участник! Всего участников ${baseParty.size}")
    } else {
        println("Всего хорошего!")
        exitProcess(1)
    }
    println("День выставки!")
    Thread.sleep(1000)
    println("Сегодня у нас будут выступать")
    for (dog in baseParty) {
        println("${dog.name}, ей ${dog.age} лет")
        Thread.sleep(1000)
    }
    println("Приступим к выставке!")
    Thread.sleep(1000)
    for (dog in baseParty) {
        println("И $count у нас будет выступать ${dog.name}")
        dog.dogPerformance()
        count++
        Thread.sleep(1000)
    }
    resultPoints(baseParty)

}

class Dog(val name: String, var age: Int) {
    var points: Int = 0
    fun dogPerformance() {
        println("\"Показывает выступление\"")
        points = Random.nextInt(1, 50)
        println("Набирает за это выступление $points баллов")
    }
}

fun resultPoints(table: MutableList<Dog>) {
    var maxPoint = 0
    val resultTable: MutableList<String> = mutableListOf()

    for (point in table) {
        if (maxPoint < point.points) {
            maxPoint = point.points
            resultTable.add(0, "${point.name} набрав $maxPoint")
        }
    }
    for (i in resultTable) {
        println("1 место занимает $i")

    }

}