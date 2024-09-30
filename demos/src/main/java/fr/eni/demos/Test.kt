package fr.eni.demos

import java.time.LocalDateTime

fun main() {
    demoByLazy()
    demoVal()
    demoVar()
    demoNullable()
}

fun demoByLazy() {
    val product : String by lazy { fetchProduct() }
    println("Initialisation de la session...")
    println("Connexion en cours")

    /*
     * Intérêt du lazy : l'appel à la fonction fetchProduct
     * n'a lieu que si la valeur "product" n'a pas été renseignée.
     */
    println(product)
    println(product)
    println(product)
}

fun fetchProduct() : String {
    println("on récupère le produit")
    return "Bureau"
}

fun demoVal() {
    val idProduct = 120L
    // Un val est constant : impossible à redéfinir
    // idProduct = 0
}

fun demoVar() {
    var quantity : Int = 0
    quantity = 12
    println("quantité : $quantity")
}

fun demoNullable() {
    // Que se passe-t-il quand on affiche un null
    val orderName : String? = null
    val emailObject = "This order is named $orderName"

    println(emailObject)

    // Que se passe-t-il quand on fait des opérations sur un null
    val totalHT : Int? = null
    val totalTTC : Double? = totalHT?.times(1.2)

    // Utilisation de l'opérateur Elvis pour se prémunir de la valeur null
    val totalTTCBis : Double = totalHT?.times(1.2) ?: 0.0

    // Le truc à ne pas faire
    // val totalTTCANePasFaire : Double = totalHT!!.times(1.2)

    println(totalTTC)
    println(totalTTCBis)
}