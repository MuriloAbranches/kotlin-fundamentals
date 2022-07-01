package fundamentals

class Car(var color: String, val year: Int, val owner: Owner) {
}

data class Owner(var name: String, var age: Int){
}

fun main() {
    var car = Car("White", 2022, Owner("Murilo", 26))

    println(car.color)

    car.color = "Black"

    println(car.color)
    println(car.owner.name)

    car.owner.name = "Murilo Abranches"
    println(car.owner)
}