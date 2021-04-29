package ch2_poo

interface Movie {
    val title: String
    val rank: Int

    fun describe(): String
}

open class SimpleMovie(override val title: String, override val rank: Int) : Movie {

    // Public by default
    override fun describe(): String {
        return "Just another movie"
    }
}


class BigNanard(override val title: String) : SimpleMovie(title, 0) {

    override var rank: Int = 0
        get() = 0
        set(value) = if (value < 1) field = value else println("No way!!!")

    override fun describe(): String {
        return "You don’t want to watch this one"
    }
}


fun main() {
    val simpleMovie = SimpleMovie("Avatar", 3)
    println("${simpleMovie.title}: ${simpleMovie.describe()}")


    val bigNanard = BigNanard("Sharknado")

    println("${bigNanard.title}: ${bigNanard.describe()}")
    bigNanard.rank = 3
}

