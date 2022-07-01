package fundamentals

class Person(var name: String, var age: Int) {
    override fun toString(): String {
        return "Person Class: Name = $name, Age = $age"
    }
}

fun main() {
    var me = Person("Murilo", 26)
    println(me)
}