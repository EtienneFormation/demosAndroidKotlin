package fr.eni.correctionkotlinavecpoo

open class Item (
    val titre : String,
    val auteur : String,
    val annee : Int,
    var isAvailable : Boolean = true)