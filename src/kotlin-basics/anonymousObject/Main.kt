package anonymousObject

import java.util.concurrent.Executors

fun main() {

    Executors.callable(object: Runnable{
        override fun run() {
            //...
        }
    })

//    lambda version
//    Executors.callable {
//        //...
//    }


}