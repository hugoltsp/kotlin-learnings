package highOrderFunctions

fun main() {

//      filter here is a high order function
//      val filteredList = listOf(1, 2, 3).filter(Int::isOdd)

//    multiplyIf(2, { it.isOdd() })
    println(multiplyIf(9, Int::isOdd))
}

fun multiplyIf(num: Int, fn: (Int) -> Boolean): Int {

    if (fn(num)) {

        return num * num

    }

    return num

}