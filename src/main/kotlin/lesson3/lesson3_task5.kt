package lesson3

fun main() {
    val userMoves: String = "D2-D4;0"
    var startingPosition: String
    var endPosition: String
    var numberMoves: String

    var splitMessage = userMoves.split("""[-;]""".toRegex())
    startingPosition = splitMessage[0]
    endPosition = splitMessage[1]
    numberMoves = splitMessage[2]

    println(startingPosition)
    println(endPosition)
    println(numberMoves)


}