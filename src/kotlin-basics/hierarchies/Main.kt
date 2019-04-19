package hierarchies

import `kotlin-basics`.hierarchies.Car
import `kotlin-basics`.hierarchies.Cow
import `kotlin-basics`.hierarchies.Mooable

fun main() {

    println("class hierarchies in kotlin")

    Car("Del Rey GLX").move()

    var m = Cow();

    m.moo();
}