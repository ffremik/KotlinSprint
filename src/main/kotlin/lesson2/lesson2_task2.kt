package lesson2

fun main() {
    val workers = 50
    val salaryWorkers = 30000
    val expensesWorkers = workers * salaryWorkers

    val trainees = 30
    val salaryTrainees = 20000
    val expensesTrainees = trainees * salaryTrainees

    val expenses = expensesWorkers + expensesTrainees
    val averageTrainees = expenses/(workers+trainees)

    println("Расходы постоянных рабочих составляют:$expensesWorkers")
    println("Общие расходы постоянных рабочих и стажёров составляют:$expenses")
    println("Средняя зарплата сотрудника после устройства стажёров составляет:$averageTrainees")

}