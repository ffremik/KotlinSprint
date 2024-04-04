package lesson3

fun main() {
    val name = "Татьяна"
    var lastName = "Андреева"
    val surName = "Сергеевна"
    var age = 20

    println("[ФИО: $lastName $name $surName, возраст: $age]")

    lastName = "Сидоровна"
    age = 22

    println("[ФИО: $lastName $name $surName, возраст: $age]")

}