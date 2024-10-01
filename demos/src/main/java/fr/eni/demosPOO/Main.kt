package fr.eni.demosPOO

fun main() {
    val devNantais = Emploi("Développeur", 34000, true, "Nantes")
    val designerTeletravail = Emploi("Designer", 44000, true, null)
    val dirigeantESN = Emploi("PDG", 74000, true, "Paris")

    println(devNantais.toString())

    println(designerTeletravail == dirigeantESN)


    val smartphone = AppareilBluetooth("10:5f:84:ae:0e")
    smartphone.connecter()
}