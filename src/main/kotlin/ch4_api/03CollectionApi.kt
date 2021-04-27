package ch4_api

import ch2_poo.*

fun main() {

    val prelogy = listOf(ThePhantomMenace(), AttackOfTheClones(), RevengeOfTheSith())
    val trilogy = listOf(ANewHope(), TheEmpireStrikesBack(), TheReturnOfTheJedi())

    prelogy.forEachIndexed { i, movie -> println("${movie.title} is the ${i + 1}th episode") }
    
    prelogy.zip(trilogy) { p, t -> println("${p.title} is recent, ${t.title} is old") }
}

