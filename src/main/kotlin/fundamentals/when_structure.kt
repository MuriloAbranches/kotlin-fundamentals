package fundamentals

fun main() {

    print("Enter the number = ")
    when(readln().toInt()) {
        5, -5 -> println("number == 5")
        8 -> println("number == 5")
        9 -> println("number == 5")
        10-> {
            println("number == 10")
            println("number is ten")
        }
        in 11..15-> println("number is between 11 and 15")
        !in 16 .. 20 -> println("number is not between 16 and 20")
        else -> println("Unexpected number")
    }

    when {
        startsWithHi(5) -> println("Number 5")
        startsWithHi("Hi, how are you?") -> println("Starts with Hi")
    }
}

fun startsWithHi(value : Any): Boolean {
    return when (value) {
        is String -> value.startsWith("Hi")
        else -> false
    }
}