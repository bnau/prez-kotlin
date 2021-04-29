package ch1_basis

fun main() {

    // We have type inference
    val simpleString = "Blablabla"

    println("simpleString is: $simpleString")
    println("Big simpleString is: ${simpleString.toUpperCase()}")
}
