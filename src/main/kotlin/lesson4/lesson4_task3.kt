package lesson4

//благоприятные условия для роста бобовых
const val PRESENCE_SUNNY_WEATHER = true
const val OPEN_AWNING = true
const val AIR_HUMIDITY = 20
const val TIME_YEAR = "не зима"

fun main() {
    //текущие условия
    val isSunny = true
    val isAwningOpen = true
    val currentAirHumidity = 20
    val currentTimeYear = "зима"

    val result = PRESENCE_SUNNY_WEATHER == isSunny && OPEN_AWNING == isAwningOpen
            && AIR_HUMIDITY == currentAirHumidity && !TIME_YEAR.contains(currentTimeYear)

    println("Благоприятная ли условия сейчас для роста бобовых? $result ")

}