package fr.eni.demos

fun main() {
    demoIf()
    demoWhen()
}

fun demoIf() {
    val customerLivingInFrance = true
    val customerLivingInNl = false

    // Version courte avec le if avec affectation de Kotlin
    val shippingCost =
        if (customerLivingInFrance) 5
        else if (customerLivingInNl) 8
        else 78

    // Version longue à la Java
    val shippingCost2 : Int
    if (customerLivingInFrance)
        shippingCost2 = 5
    else if (customerLivingInNl)
        shippingCost2 = 8
    else shippingCost2 = 78

    println(shippingCost)
    println(shippingCost2)
}

fun demoWhen() {
    val idCategory = 4000
    val category = when(idCategory) {
        1,2,3,4 -> "Grands titres"
        in 1000..4000 -> "Alimentaire"
        in 4001..10000 -> "Culture"
        else -> "Autre"
    }

    println(category)
}
