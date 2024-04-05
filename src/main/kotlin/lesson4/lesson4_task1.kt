package lesson4

fun main() {
    val totalTables = 14
    val freeTableToday = 14
    val freTableTomorrow = 10

    println("Доступность столиков на сегодня:${freeTableToday < totalTables}\n" +
            "Доступность столиков на завтра:${freTableTomorrow < totalTables}")

}