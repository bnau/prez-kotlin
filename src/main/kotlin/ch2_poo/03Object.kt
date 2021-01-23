package ch2_poo

// This is a singleton
object Netflix {
    val series = mutableListOf<Serie>()
}


class Serie(
        val title: String,
        val numberOfEpisodes: Int
) {

    fun watch() {
        println("You're watching $title with $numberOfEpisodes episodes")
    }

    // Solution to create static members
    companion object {
        fun createNetflixSerie(title: String, numberOfEpisodes: Int): Serie {
            val serie = Serie(title, numberOfEpisodes)
            Netflix.series.add(serie)
            return serie
        }
    }
}

fun main() {
    Serie.createNetflixSerie("Black Mirror", 10)
    Serie.createNetflixSerie("House of Cards", 100)

    Netflix.series.forEach(Serie::watch)
}
