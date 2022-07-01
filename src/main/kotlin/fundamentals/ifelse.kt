package fundamentals

fun main() {

    gradeResult(3)
    gradeResult(5)
    gradeResult(8)

    println(evenOrOdd(2))
    println(evenOrOdd(3))
}

fun evenOrOdd(number: Int): String {
    return if(number % 2 == 0) "Even" else "Odd"
}

fun gradeResult(grade: Int) {
    if (grade >= 6) {
        println("Moved on")
    } else if (grade >= 4) {
        println("Retake")
    } else {
        println("Failed")
    }
}