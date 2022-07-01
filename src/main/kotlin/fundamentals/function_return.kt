package fundamentals

fun returnNumberInFull(number: Int): String {
    if (number == 5) {
        return "Five"
    } else if (number == 6) {
        return "Six"
    }

    return "Unexpected number"
}

fun main() {
    println(returnNumberInFull(5))
    println(returnNumberInFull(6))
    println(returnNumberInFull(12))
}