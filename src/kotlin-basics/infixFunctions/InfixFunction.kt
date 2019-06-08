package infixFunctions

infix fun String.extractDifferenteChars(otherString: String): List<Char> {

    val list = ArrayList<Char>()

    for (c in this.toCharArray()) {

        if (!otherString.contains(c)) {

            list.add(c)

        }

    }

    return list
}
