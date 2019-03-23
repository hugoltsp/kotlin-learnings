package loops

import whenConstruct.Color

fun main() {

    println("goofing around with kotlin loop structures :)")

    countToTen()
    iterateOverColorEnum()

}

fun iterateOverColorEnum() {

    println("iterating over our color enum")

    for (c in Color.values()) {

        println(c)

    }

}

private fun countToTen() {

    println("counting to ten")

    for (i in 1..10) {
        println(i)
    }

}