package fr.eni.correctionkotlinavecpoo

class User (
    val name : String,
    val id : Int
) {
    fun borrow(borrowable: Borrowable) {
        borrowable.borrow(this)
    }

    fun returnItem(borrowable: Borrowable) {
        borrowable.returnItem(this)
    }
}