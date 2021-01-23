package ch4_api

fun main() {

    (1..3).map { it * 2 }

    var list = listOf(1, 2, 3).map { it * 2 }
            .filter { it < 5 }
    // Copy the list and adds 10
    list += 10

    val mutList = mutableListOf(1, 2, 3).map { it * 2 }
            .filter { it < 5 }

    mutList.plus(10)

    // A sequence is like a Java Stream
    sequenceOf(1, 2, 3).map { it * 2 }
            .filter { it < 5 }
            .toList()
}

