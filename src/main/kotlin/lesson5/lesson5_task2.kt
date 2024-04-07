package lesson5

const val AGE_OF_MAJORITY = 18

fun main() {
    val year = 2024
    val userYear: Int
    val isAccess: Boolean

    println("Введите ваш год рождения")
    userYear = readln().toInt()

    isAccess = year - userYear >= AGE_OF_MAJORITY

    if (isAccess){
        println("Показать экран со скрытым контентом")
    }else{
        println("Доступ закрыт")
    }
}