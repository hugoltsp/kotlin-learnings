package whenConstruct

import whenConstruct.Color.*

fun main() {
    println("demonstrating when constructs w/ kotlin")
    whenConstruct(GREEN)
}

private fun whenConstruct(color: Color) {

    val strTemplate = "you have chosen '${color.nameToLowercase()}'"

    // could also be RED,BLUE,GREEN -> println(strTemplate)
    when (color) {
        RED -> println(strTemplate)
        BLUE -> println(strTemplate)
        GREEN -> println(strTemplate)
    }

}
