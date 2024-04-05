package lesson4

fun main() {
    val initialWeightAverage = 35
    val maxWeightAverage = 100
    val maxVolume = 100

    val weightFirstCargo = 20
    val volumeFirstCargo = 80
    val weightSecondCargo = 50
    val volumeSecondCargo = 100

    println("Груз весом $weightFirstCargo кг и объемом $volumeFirstCargo л соответствует категории 'Average': " +
                "${weightFirstCargo >= initialWeightAverage && 
                   weightFirstCargo <= maxWeightAverage && 
                   volumeFirstCargo <= maxVolume}")

    println("Груз весом $weightSecondCargo кг и объемом $volumeSecondCargo л соответствует категории 'Average': " +
            "${weightSecondCargo >= initialWeightAverage &&
                    weightSecondCargo <= maxWeightAverage &&
                    volumeSecondCargo <= maxVolume}")
}