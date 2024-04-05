package lesson4

fun main() {
    val totalTables = 14
    val busyTableToday = 14
    val busyTableTomorrow = 10

    println("Доступность столиков на сегодня:${busyTableToday < totalTables}\n" +
            "Доступность столиков на завтра:${busyTableTomorrow < totalTables}")

}