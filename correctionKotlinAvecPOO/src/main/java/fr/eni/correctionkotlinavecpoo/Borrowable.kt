package fr.eni.correctionkotlinavecpoo

interface Borrowable {
    fun borrow(user : User) : Boolean
    fun returnItem(user : User)
}