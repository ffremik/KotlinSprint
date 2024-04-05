package lesson3

fun main() {
    var startingPosition = "E2"
    var endPosition = "E4"
    var numberMoves = 1

    var message = "[$startingPosition:$endPosition;$numberMoves]"
    println(message)

    startingPosition = "D2"
    endPosition = "D3"
    numberMoves = 2

    message = "[$startingPosition:$endPosition;$numberMoves]"
    println(message)

}