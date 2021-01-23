package ch2_poo

// An enum is great, but it can’t extend a class
enum class MovieType {
    THRILLER, HORROR, ROMANCE
}

// Limited number of children classes
sealed class StarWars(override val title: String) : Movie {
    override val rank = 5

    override fun describe(): String {
        return "In a galaxy far, far away"
    }
}

class ANewHope : StarWars("A New Hope")
class TheEmpireStrikesBack : StarWars("The Empire Strikes Back")
class TheReturnOfTheJedi : StarWars("The Return Of The Jedi")


// automatically adds equals()/hashCode(), toString(), copy()
data class Actor(
        val firstName: String,
        val lastName: String,
        val role: String,
)

fun main() {
    val harrisonFord = Actor("Harrison", "Ford", "Han Solo")

    // Destructuring
    val (firstName, lastName, role) = harrisonFord
    print("$firstName $lastName plays $role")

    // Cloning
    val cloned = harrisonFord.copy(role = "Indiana Jones")

}
