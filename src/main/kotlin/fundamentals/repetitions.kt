package fundamentals

fun main() {
    printNumbersFrom1To10()
    printNumbersFrom10To1()
    printEvenNumbersFrom1To10()
    printRange(10, 20)
    whileLowerThan10()
    doWhileLowerThan10()
}

fun printNumbersFrom1To10() {
    for (number in 1..10) {
        print("$number ")
    }
    println()
}

fun printNumbersFrom10To1() {
    for (number in 10 downTo 1) {
        print("$number ")
    }
    println()
}

fun printEvenNumbersFrom1To10() {
    for (number in 2..10 step 2) {
        print("$number ")
    }
    println()
}

fun printRange(start: Int, end: Int) {
    for (number in start..end) {
        print("$number ")
    }
    println()
}

fun whileLowerThan10() {
    var number = 0

    while (number < 10) {
        print("$number ")
        number++
    }
    println()
}

fun doWhileLowerThan10() {
    var number = 0

    do {
        print("$number ")
        number++
    } while (number < 10)

    println()
}