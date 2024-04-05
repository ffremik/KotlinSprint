package lesson4

fun main() {
    //Условия для экспедиции
    val withoutDamage: Boolean
    val crewSize = 55..70
    val minimumProvisions = 50
    val favorableWeather: Boolean

    //Входные условия экспедиции
    withoutDamage  = readLine().toBoolean()
    val crew = readLine()?.toInt()
    val provisions = readLine()?.toInt()
    favorableWeather = readLine().toBoolean()

    if (!withoutDamage && crew in crewSize && provisions!! >= minimumProvisions){
        println("Корабль может отправляться в экспедицию")
    }
    else if (withoutDamage && crew == crewSize.max() && provisions!! >= minimumProvisions && favorableWeather) {
        println("Корабль может отправляться в экспедицию имея незначительные повреждения")
    }else{
        println("Корабль не может отправляться в экспедицию")
    }
}