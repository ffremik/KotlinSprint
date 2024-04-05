package lesson2

import kotlin.math.pow

fun main() {
    val initialAmount = 70000
    val years = 20
    val percentRates = 16.7
    val percent = 100
    val initial = 1

    val futureAmount = initialAmount * (initial + percentRates / percent).pow(years)
    println(String.format("%.3f", futureAmount))
}