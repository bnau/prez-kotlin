package ch3_functions

import ch2_poo.*

fun main() {
    val movies = listOf(ANewHope(), TheEmpireStrikesBack(), TheReturnOfTheJedi())

    // Function reference
    movies.forEach(Movie::watch)

    // Classic Lambda (no need to surround with parenthesis)
    movies.forEach { movie -> movie.watch() }

    // it as default lambda parameter
    movies.forEach { it.watch() }
}
