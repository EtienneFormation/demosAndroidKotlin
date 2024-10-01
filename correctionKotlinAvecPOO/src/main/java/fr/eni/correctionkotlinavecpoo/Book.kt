package fr.eni.correctionkotlinavecpoo

class Book (
    titre : String,
    auteur : String,
    anneeSortie : Int,
    val genre : String) : Item(titre, auteur, anneeSortie), Borrowable {

    override fun borrow(user : User): Boolean {
        if (isAvailable) {
            isAvailable = false
            println("$titre has been borrowed by ${user.name}")
            return true
        }
        println("$titre is not available for borrowing")
        return false
    }

    override fun returnItem(user : User) {
        isAvailable = true
        println("$titre has been returned by ${user.name}")
    }
}