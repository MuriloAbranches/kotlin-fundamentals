package fundamentals

class MyClass(val name: String,val age: Int) {
    companion object {
        fun convertAnyClassToMyClass(anyClass: AnyClass): MyClass {
            return MyClass(anyClass.name, anyClass.age)
        }
    }
}

class AnyClass(val name: String, val age: Int) {
    fun convertMyClassToAnyClass(myClass: MyClass): AnyClass {
        return AnyClass(myClass.name, myClass.age)
    }
}

fun main() {

    val anyClass = AnyClass("Murilo", 26)
    val myClass = MyClass.convertAnyClassToMyClass(anyClass)

    val convertMyClass = AnyClass("Test", 10).convertMyClassToAnyClass(myClass)
}