package lesson2

const val TIME_MINUTE_AND_HOURS = 60

fun main() {
    val departureHours = 9
    val departureMinute = 39

    val travelTimeMinute = 457
    val remainingMinute = travelTimeMinute % TIME_MINUTE_AND_HOURS
    val travelTimeHours = travelTimeMinute / TIME_MINUTE_AND_HOURS

    val arrivalHours = (departureHours + travelTimeHours) + ((departureMinute + remainingMinute) / TIME_MINUTE_AND_HOURS)
    val arrivalMinute = (departureMinute + travelTimeMinute) % TIME_MINUTE_AND_HOURS

    println("Время отправления поезда в $departureHours часов и $departureMinute минут")
    println("Поезд будет в пути $travelTimeHours часов и $remainingMinute минут")
    println("Поезд прибывает в $arrivalHours:$arrivalMinute")


}