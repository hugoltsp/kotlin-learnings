package customGetAccessor

class Person(
    val name: String,
    val age: Int
) {
    val isAdult get() = age >= 8
    /*
        val isAdult: Boolean
        get() {
            println("Running a custom getter..")
            return age >= 8
        }
     */
}