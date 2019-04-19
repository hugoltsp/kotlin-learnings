package `kotlin-basics`.hierarchies

//kotlin classes are final by default
//this class is a non-abstract, open (that means, it is not final)
open class Vehicle(val model: String) {

    //methods must be declared as open too
    open fun move() = println("This ${this.javaClass.kotlin} is moving.")

}