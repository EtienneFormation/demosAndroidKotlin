package fr.eni.demos

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    demoFnExtension()
    demoFnGenerique()
    demoFnLambda()
}

fun demoFnExtension() {
    val now = LocalDateTime.now()
    println(now.showInFrench())
}

fun LocalDateTime.showInFrench() : String {
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'à' HH'h'mm")
    return this.format(formatter)
}

fun demoFnGenerique() {
    val clients = listOf("Peter Parker", "Tony Stark", "Bruce Banner")
    val age = listOf(12, 28, 42, 53)

    println(concatenate(clients))
    println(concatenate(age, ";"))

}

fun <T> concatenate(list : List<T>, separator: String = ", ") : String {
    val builder = StringBuilder()
    for ((index, item) in list.withIndex()) {
        if (index > 0) builder.append(separator)
        builder.append(item)
    }
    return builder.toString()
}

fun demoFnLambda() {
    val listProducts = mutableListOf(
        "Bureau avec vérins",
        "Chaise de travail Herman Miller",
        "Bureau Steelcase chêne",
        "Bureau Ikea SEKOVA",
        "Bureau blanc",
        "Chainse Think V1",
        "Armoire métal haute"
    )

    listProducts.add("Canapé accueil")
    listProducts += "Armoire basse"

    val nombre = listProducts
        .filter { it.startsWith("Bureau") }
        .sortedBy { it }
        .count { it.contains("Ikea") }

    val sortedProducts = listProducts
        .filter { it.startsWith("Bureau") }
        .sortedBy { it }

    println(nombre)
    println(sortedProducts)
}