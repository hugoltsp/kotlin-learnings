package lambda

fun main() {

    val listOfFoods = listOf("pizza", "pão de queijo", "paçoca")

//  listOfFoods.maxBy { f -> f.length }
//  listOfFoods.maxBy(String::length)
    val maxBy = listOfFoods.maxBy { it.length }

    println(maxBy)

}