package fr.eni.demosPOO.heritage

fun main() {
    val maCle = Cle()
    val maCleDeVoiture = CleVoiture()

    maCle.ouvrirPorte()
    maCle.fermerPorte()


    maCleDeVoiture.ouvrirPorte()
    maCleDeVoiture.fermerPorte()
    maCleDeVoiture.ouvrirCoffre()
}