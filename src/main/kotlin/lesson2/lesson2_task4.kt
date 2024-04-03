package lesson2

fun main() {
    val crystals = 7
    val iron = 11

    val bonusCrystals = crystals * 1.2
    val bonusIron = iron * 1.2


    println("Вы добыли $crystals кристалов, +20% бонус = ${bonusCrystals.toInt() - crystals} кристал")
    println("Вы добыли $iron железо, +20% бонус = ${bonusIron.toInt() - iron} железа")

}