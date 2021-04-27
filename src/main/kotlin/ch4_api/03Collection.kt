package ch4_api

fun main() {

    // Returns [2, 4, 6]
    (1..3).map { it * 2 }

    // Immutable list
    val list = listOf(1, 2, 3).map { it * 2 }
            .filter { it < 5 }

    // Mutable list
    var mutList = mutableListOf(1, 2, 3).map { it * 2 }
            .filter { it < 5 }

    // Adds 10 to the list
    mutList += 10
    // Concatenates lists
    mutList += list

    // A sequence is like a Java Stream
    list.asSequence().map { it * 2 }
            .filter { it < 5 }
            .toList()


    // Immutable map...
    mapOf(Pair("KEY1", 1),
            Pair("KEY2", 2))
}

