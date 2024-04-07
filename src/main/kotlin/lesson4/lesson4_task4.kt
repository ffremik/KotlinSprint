package lesson4

fun main() {
    val day = 1
    var armExerciseCurrent: Boolean
    var legExerciseCurrent: Boolean
    var backExerciseCurrent: Boolean
    var abdominalExerciseCurrent: Boolean
    val isEven: Boolean = (day % 2) == 0

    if (isEven) {
        armExerciseCurrent = false
        legExerciseCurrent = true
        backExerciseCurrent = true
        abdominalExerciseCurrent = false
    }else {
        armExerciseCurrent = true
        legExerciseCurrent = false
        backExerciseCurrent = false
        abdominalExerciseCurrent = true
    }

    println("""
        Упражнение на руки:   $armExerciseCurrent
        Упражнения для ног:   $legExerciseCurrent
        Упражнения для спины: $backExerciseCurrent
        Упражнения для пресса:$abdominalExerciseCurrent
    """.trimIndent())
}