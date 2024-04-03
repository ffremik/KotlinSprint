package lesson2

import kotlin.math.pow

fun main() {
    val initialAmount = 70000

    val futureAmount = initialAmount * (1 + 16.7/100).pow(20)
    println(String.format("%.3f", futureAmount))
}