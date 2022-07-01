package fundamentals

fun main() {
    sayHi(returnName(), 26)
    sayHi(age = 26, name = "Murilo Abranches")
    sayHi("Murilo")
}

fun returnName(): String {
    return "Murilo"
}

fun sayHi(name: String, age: Int = 20) {
    println("Hi $name, congrats on your ${age}th birthday")
}