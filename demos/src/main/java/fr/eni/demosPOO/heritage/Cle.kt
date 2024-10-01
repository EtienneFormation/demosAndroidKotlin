package fr.eni.demosPOO.heritage

// open sur la classe : on peut hériter de la classe clé
open class Cle {
    // open sur une méthode : on peut redéfinir le comportement de la méthode
    open fun ouvrirPorte() {
        println("Ouverture de porte")
    }

    fun fermerPorte() {
        println("Fermeture de porte")
    }
}


class CleVoiture() : Cle() {
    // redéfinition de la méthode ouvrirPorte
    override fun ouvrirPorte() {
        // super.ouvrirPorte()
        println("Ouverture de toutes les portes")
    }

    fun ouvrirCoffre() {
        println("Ouverture du coffre uniquement")
    }
}