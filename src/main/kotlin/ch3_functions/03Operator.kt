package ch3_functions

import ch2_poo.ANewHope
import ch2_poo.Movie
import ch2_poo.RevengeOfTheSith

// Overloads the > and < operators
operator fun Movie.compareTo(movie2: Movie): Int {
    return rank.compareTo(movie2.rank);
}

fun main() {

    // Uses the compareTo method
    if (RevengeOfTheSith() > ANewHope()) print("I agree") else print("WTF???")
}


