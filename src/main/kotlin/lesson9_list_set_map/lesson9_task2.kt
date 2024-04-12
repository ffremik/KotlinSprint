package lesson9_list_set_map

fun main() {
    val baseEmail: MutableSet<String> = mutableSetOf("почта1","почта2","почта3")
    var userReply: String
    var isTrue = false

    println("Регистрация нового почтового ящик. Введите адресс")
    while (!isTrue){
        userReply = readln()
        if (userReply !in baseEmail) {
            println("Данный адрес почты свободен, хотите его занять? да/нет")
            var userReplyYesAndNoy = readln()
            if (userReplyYesAndNoy == "да") {
                baseEmail.add(userReply)
                println("Вы заняли Email адрес: $userReply")
                isTrue = true
            }else{
                println("Хотите придумать новый адрес? ")
                userReplyYesAndNoy = readln()
                if (userReplyYesAndNoy == "нет"){
                    break
                }else{
                    println("Введи новое название: ")
                }
            }
        }else{
            println("Данный почтовый ящик занят! Введи другой")
        }
    }

}