package ch3_functions

// default parameter
fun sayHello(hello: String = "Hello", name: String = "World") = println("$hello $name")

fun main() {
    sayHello()
    sayHello("Bonjour")

    // Named Parameter
    sayHello(name = "Kotlin")
}
