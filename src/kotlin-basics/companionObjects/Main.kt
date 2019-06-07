package companionobjects

fun main() {

    //User.Companion.newUppercaseNamedUser("user@mail.com", 26, "leo");

    val uppercaseNamedUser = User.newUppercaseNamedUser("user@mail.com", 26, "leo")

    println(uppercaseNamedUser.name)

}