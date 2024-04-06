package lesson4
    const val INITIAL_WEIGHT_AVERAGE = 35
    const val MAX_WEIGHT_AVERAGE = 100
    const val MAX_VOLUME = 100

fun main() {
    val weightFirstCargo = 20
    val volumeFirstCargo = 80
    val weightSecondCargo = 50
    val volumeSecondCargo = 100

    println("Груз весом $weightFirstCargo кг и объемом $volumeFirstCargo л соответствует категории 'Average': " +
                "${weightFirstCargo >= INITIAL_WEIGHT_AVERAGE && 
                   weightFirstCargo <= MAX_WEIGHT_AVERAGE && 
                   volumeFirstCargo < MAX_VOLUME}")

    println("Груз весом $weightSecondCargo кг и объемом $volumeSecondCargo л соответствует категории 'Average': " +
                 "${weightSecondCargo >= INITIAL_WEIGHT_AVERAGE &&
                    weightSecondCargo <= MAX_WEIGHT_AVERAGE &&
                    volumeSecondCargo < MAX_VOLUME}")
}