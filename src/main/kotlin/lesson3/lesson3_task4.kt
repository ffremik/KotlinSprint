package lesson3

fun main() {
    var startingPosition = "E2"
    var endPosition = "E4"
    var numberMoves = 1

    var message = "Игрок сходил [$startingPosition->$endPosition: Номер хода = $numberMoves]"
    println(message)

    startingPosition = "D2"
    endPosition = "D3"
    numberMoves = 2

    message = "Игрок сходил [$startingPosition->$endPosition: Номер хода = $numberMoves]"
    println(message)

}