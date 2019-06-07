package companionobjects

class User(
    val name: String,
    val age: Int,
    val email: String
) {

    companion object {

        fun newUppercaseNamedUser(email: String, age: Int, name: String) = User(name.toUpperCase(), age, email)

    }

}