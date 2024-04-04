package lesson2
    const val NUMBER_STUDENTS = 4
fun main() {
    val studentOne = 3
    val studentTo = 4
    val studentThree = 3
    val studentFour = 5

    val averageNumber = (studentOne + studentTo + studentThree + studentFour).toFloat() / NUMBER_STUDENTS

    println("Средняя оценка в классе $averageNumber")


}