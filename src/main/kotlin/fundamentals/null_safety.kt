package fundamentals

fun main() {

    var name: String? = "Murilo"
    val toShort: Short = name!!.length.toShort()

    println(toShort)

    name = null
    val length: Int = name?.length ?: 0

    println(length)

    var list: List<Int?> = listOf(1, 2, null, 3)
    var nullableList : List<Int>? = null
}