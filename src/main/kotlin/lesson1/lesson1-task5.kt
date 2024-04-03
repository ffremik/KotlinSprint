package lesson1

const val MINUTES_AND_HOURS : Byte = 60

fun main() {
    val second: Int = 6480
    val minute: Int = second / MINUTES_AND_HOURS
    val hour: Int = minute / MINUTES_AND_HOURS
    val remainingMinutes: Int = minute % MINUTES_AND_HOURS
    val remainingSecond: Int = second % MINUTES_AND_HOURS


    println(String.format("%02d:%02d:%02d", hour, remainingMinutes, remainingSecond))
}