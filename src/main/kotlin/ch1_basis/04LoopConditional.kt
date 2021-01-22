package ch1_basis

import java.lang.Integer.parseInt

fun main() {
    val simpleString: String
    if (true) {
        simpleString = "blabla"
    } else {
        simpleString = "bloblo"
    }

//    val simpleString =
//            if (true)
//                "blabla"
//            else
//                "bloblo"

    val x = 1

    when (x) {
        0, 1 -> print("x <= 1")
        2 -> print("x == 2")
        parseInt("3") -> print("x == 2")
        else -> {
            print("x is superior to 3")
        }
    }

    when (x) {
        is Int -> print("x is an Integer")
        !is Int -> print("x is not an Integer")
    }


    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }


}
