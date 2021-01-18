package ch1_basis

import kotlin.reflect.KParameter

fun main(args: Array<String>) {
    println("Hello World")

    val any = Any()
    val nothing = nothing{ s -> s + "" }
    KParameter.Kind.VALUE
}

fun nothing(blabla: (String)-> String): Nothing {

}

data class Folder(val test) 
