package namedArgumentsEDefaultParams

fun main() {

    println("named aguments and default parameters")

    format("aaa", suffix = "[", prefix = "]")
}

fun format(text: String = "some default text", prefix: String = "(", suffix: String = ")") {

    println("$prefix$text$suffix")

}
