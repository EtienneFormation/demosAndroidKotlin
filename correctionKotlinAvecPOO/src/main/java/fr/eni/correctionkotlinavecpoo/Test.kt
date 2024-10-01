package fr.eni.correctionkotlinavecpoo

fun main() {
    val kotlinProg = Book("Kotlin programming", "Jane Doe", 2021, "Education")
    val flutterProg = Book("Flutter programming", "Majid", 2023, "Education")
    val harryPotter = Book("Harry Potter", "JK Rowling", 1995, "Novel")

    val jeanmich = User("Jean michel", 1)
    val robert = User("Robert Jackson", 2)

    jeanmich.borrow(kotlinProg)
    robert.borrow(kotlinProg)
    robert.borrow(flutterProg)

    jeanmich.returnItem(kotlinProg)
    robert.returnItem(flutterProg)
}