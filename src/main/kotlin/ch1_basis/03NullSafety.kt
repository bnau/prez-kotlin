package ch1_basis

fun printTwoStrings(nonNullableString: String, nullableString: String?) {

    println(nonNullableString.toUpperCase())

    println(nullableString?.toUpperCase())
//  println(nullableString.toUpperCase()) /* Error!!!!! */

    println(nullableString ?: "Default String")

    println(nullableString!!.toUpperCase())

}

fun main() {

    printTwoStrings("Blabla", null)
//  printTwoStrings(null, null) /* Error!!!!! */
}
