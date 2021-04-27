package ch1_basis

fun printTwoStrings(nonNullableString: String, nullableString: String?) {

    println(nonNullableString.toUpperCase())

    // We must check the nullability with ?.
    println(nullableString?.toUpperCase())

//  println(nullableString.toUpperCase()) /* Error!!!!! */

    // We provide a default value with ?:
    println(nullableString ?: "Default String")

    // We assume the variable is not null with !!
    println(nullableString!!.toUpperCase())

    // The variable has been automatically casted to String
    nullableString.toUpperCase()

}

fun main() {

    printTwoStrings("Blabla", null)
//  printTwoStrings(null, null) /* Error!!!!! */
}
