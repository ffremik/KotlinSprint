package lesson4

fun main() {
    //благоприятные условия для роста бобовых
    val presenceSunnyWeather = true
    val openAwning = true
    val airHumidity = 20
    val timeYear = "Лето, Весна, Осень"

    //текущие условия
    val currentSunnyWeather = true
    val currentOpenAwning = true
    val currentAirHumidity = 20
    val currentTimeYear = "Зима"

    val result = presenceSunnyWeather == currentSunnyWeather && openAwning == currentOpenAwning
            && airHumidity == currentAirHumidity && timeYear.contains(currentTimeYear)

    println("Благоприятная ли условия сейчас для роста бобовых? $result ")

}