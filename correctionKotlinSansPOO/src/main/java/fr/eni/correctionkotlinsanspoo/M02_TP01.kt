package fr.eni.correctionkotlinsanspoo

val toSeeMovies = mutableListOf<String>()
val seenMovies = mutableListOf<String>()

fun main() {
    displayMenu()
}

fun displayMenu() {
    while (true) {
        println("Choisissez")
        println("1. Ajouter un film déjà vu")
        println("2. Ajouter un film/série à voir")
        println("3. Voir toute la liste")
        println("4. Exit")

        val choice = readln().toIntOrNull()
        // toInt avec try catch
        // toIntOrNull
        // conserver en String

        when (choice) {
            1 -> addSeen()
            2 -> addToSee()
            3 -> listMovies()
            4 -> break
            else -> println("choix invalide")
        }
    }

    println("bye bye")
}

fun addSeen() {
    println("Nom du film :")
    val name = readln()
    seenMovies += name
}

fun addToSee() {
    println("Nom du film :")
    val name = readln()
    toSeeMovies += name
}

fun listMovies() {
    println("Films vus :")
    for (movie in seenMovies) println(movie)

    println("Films à voir :")
    for (movie in toSeeMovies) println(movie)
}