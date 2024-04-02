package lesson1

fun main() {
    var second: Int = 6480
    var minute: Int = 0
    var hour: Int = 0

    while (second >= 60) {
        minute++
        second -= 60
        if (minute >= 60){
            hour++
            minute -= 60
        }
    }
    println("0$hour:$minute:0$second") //честно скажу, не знаю как отобразить числовые переменные у которых идёт 0. Знаю есть различные функции, но тут пока тема про переменные идёт
}