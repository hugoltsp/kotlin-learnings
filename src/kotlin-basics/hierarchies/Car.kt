package `kotlin-basics`.hierarchies

class Car(model: String) : Vehicle(model) {

    override fun move(){
        println("This ${this.javaClass.kotlin} model: $model is moving.")
    }

}