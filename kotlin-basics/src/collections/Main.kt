package collections


fun main() {

    println("collections")

    val arrayList = arrayListOf(1, 2, 3)
    val list = listOf(1, 2, 3, 89)
    val set = setOf(1, 1, 2)
    val map = mapOf(1 to "one", 2 to "two")

    printCollection(arrayList)
    printCollection(list)
    printCollection(set)
    printCollection(map)

}

fun <T> printCollection(col: Collection<T>) {

    println("data: $col class: ${col.javaClass} ")

}

fun <K, V> printCollection(col: Map<K, V>) {

    println("data: $col class: ${col.javaClass} ")

}
