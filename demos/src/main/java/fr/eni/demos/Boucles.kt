package fr.eni.demos

import kotlin.random.Random

fun main() {
    demoFor()
    demoWhile()
}

fun demoFor() {
    val listClients = listOf(
        "John Doe", "Peter Parker", "Harry Potter", "Tony Stark"
    )

    for (client in listClients) {
        println("Bienvenue cher $client, notre solution de paiement est conçue pour vous !")
    }

    for ((index, client) in listClients.withIndex()) {
        println("Bienvenue cher $client, vous êtes notre client n°${index+1}et notre solution de paiement est conçue pour vous !")
    }
}

fun demoWhile() {
    val secret = Random.nextInt(1, 11)
    println(secret)
    var guess : Int
    var attempts = 0

    println("Devinez le nombre entre 1 et 10 !")
    while(true) {
        print("Entrez votre nombre: ")
        try {
            guess = readln().toInt()
            attempts++

            if (guess == secret) {
                println("Bravo, vous êtes super fort")
                break
            } else {
                println("Try again")
            }
        } catch (e : NumberFormatException) {
            println("On a dit un nombre pauvre nouille")
        }
    }
}