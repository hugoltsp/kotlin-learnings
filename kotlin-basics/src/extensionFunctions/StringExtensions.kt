package extensionFunctions

fun String.lastChar(): Char = get(length - 1)

fun String.countOcurrences(char: Char): Int {
    return chars()
        .filter { it == char.toInt() }
        .count()
        .toInt()
}