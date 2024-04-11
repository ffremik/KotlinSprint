package lesson9_list_set_map

fun main() {
    val userBasket: MutableList<String> = mutableListOf()
    val categories = listOf("Гарнитура", "Мониторы", "Клавиатуры", "Мышки")
    var isTrue = false
    var userReply: Int

    println("Привествую в интернет магазине")
    while (!isTrue) {
        var count = 1
        println("В какой раздел зайти ?")
        for (i in categories) {
            print("$count)$i ")
            count++
        }
        println()
        userReply = readln().toInt()
        when (userReply) {
            1 -> {
                count = 1
                val categoryHeadset = listOf("Название 1, стоимость 2000р", "Название 2, стоимость 1500р")
                for (i in categoryHeadset) {
                    println("$count)$i")
                    count++
                }
                println("Желатете что-то добавить в корзину? ")
                userReply = readln().toInt()
                if (userReply > categoryHeadset.size) {
                    println("Невозможно добавить товар!")
                } else {
                    userBasket.add(categoryHeadset[userReply - 1])
                    println("Вы добавили в корзину ${categoryHeadset[userReply - 1]}")
                }
            }
            else -> {
                println("Товара нет")
            }
        }
        println("Посмотреть корзину и отплатить ? или добавить что-то ещё? ответ 1/2")
        userReply = readln().toInt()
        if (userReply == 1) {
            println("Ваша корзина:")
            for (i in userBasket) {
                println(i)
            }
            println("Вы оплатили покупки!")
            isTrue = true
        }
    }
}