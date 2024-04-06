package lesson5
    const val AGE_OF_MAJORITY = 18
fun main() {
    val year = 2024
    val userYear: Int

    println("Введите ваш год рождения")
    userYear = readLine()!!.toInt()

    if (year - userYear >= AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом")
    }else{
        println("Доступ закрыт")
    }
}