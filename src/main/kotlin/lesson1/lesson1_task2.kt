package lesson1

fun main() {
    var numberOrders: Int = 75
    var amountWorkers: Int = 2000
    val purchaseMessage: String = "Спасибо за покупку. Мы надеемся вскоре снова увидеть вас!"

    println("$purchaseMessage. Было совершено $numberOrders покупок")
    // println("У нас работают $amountWorkers сотрудников")
    amountWorkers--
    println("$amountWorkers")
}