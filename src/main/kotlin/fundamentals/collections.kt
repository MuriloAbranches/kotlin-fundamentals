package fundamentals

fun main() {

    val list = listOf(1, 2, 5, 6)
    val mutableList = mutableListOf(12, 13, 17)
    val set = setOf(1, 2, 5)
    val mutableSet = mutableSetOf(12, 13, 13, 14)
    val map = mapOf("Murilo" to 26, "João" to 20)
    val mutableMap = mutableMapOf("Murilo" to 26, "João" to 20)

    list.forEach { it -> println("It = $it") }
    mutableList.add(16)

    println(mutableList.last())
    println(set.filter { it % 2 == 1 })

    mutableSet.add(14)
    println(mutableSet)

    println(map["Murilo"])
    println(list[2])

    mutableMap.putIfAbsent("Murilo", 27)
    println(mutableMap.map {
        {
            println(it.key)
            println(it.value)
        }
    })
}