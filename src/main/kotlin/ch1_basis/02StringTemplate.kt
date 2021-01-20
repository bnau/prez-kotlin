package ch1_basis

fun main() {

    // Show the type inference
    val simpleString: String = "Blablabla"

    println("simpleString is: $simpleString")
    println("Big simpleString is: ${simpleString.toUpperCase()}")
}
