package lesson2

const val BONUS = 20.0
const val PERCENT = 100.0
fun main() {
    val crystals = 7.0
    val iron = 11

    val bonusCrystals = crystals / PERCENT * BONUS
    val bonusIron = iron / PERCENT * BONUS

    println("Вы добыли $crystals кристалов, +20% бонус = ${bonusCrystals.toInt()} кристал")
    println("Вы добыли $iron железа, +20% бонус = ${bonusIron.toInt()} железа")

}