package ch2_poo

typealias Series = List<Serie>
typealias Movies = List<Movie>

class ToWatchList(val series: Series, val movies: Movies)

fun main() {
    val toWatchList = ToWatchList(
            listOf(Serie("Friends", 10000000)),
            listOf(ANewHope(), TheEmpireStrikesBack(), TheReturnOfTheJedi()))

    toWatchList.series.forEach({ serie -> serie.watch() })
    toWatchList.movies.forEach({ movie -> movie.watch() })
}

// You can easily add missing methods to an API
fun Movie.watch() {
    println("You're watching $title")
}

