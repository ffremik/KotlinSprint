package lesson4
//Условия для экспедиции
const val DAMAGE = false
const val CREW_MIN_SIZE = 55
const val CREW_MAX_SIZE = 70
const val MINIMUM_PROVISIONS = 50
const val WEATHER = true


fun main() {
    //Входные условия экспедиции
    val isDamage: Boolean
    val isWeather: Boolean
    val crew: Int
    val provisions: Int

    println("Введите данные для отправки в экспедицию")
    println("Если у коробля повреждения ? true/false")
    isDamage = readln().toBoolean()
    println("Текущий состав экипажа ? ")
    crew = readln().toInt()
    println("Количество ящиков с провизией на борту")
    provisions = readln().toInt()
    println("Благоприятная погода? true/false")
    isWeather = readLine().toBoolean()

    if (isDamage == DAMAGE && crew in CREW_MIN_SIZE..CREW_MAX_SIZE && provisions >= MINIMUM_PROVISIONS){
        println("Корабль может отправляться в экспедицию")
    }
    else if (isDamage && crew == CREW_MAX_SIZE && provisions >= MINIMUM_PROVISIONS && isWeather == WEATHER) {
        println("Корабль может отправляться в экспедицию имея незначительные повреждения")
    }else{
        println("Корабль не может отправляться в экспедицию")
    }
}