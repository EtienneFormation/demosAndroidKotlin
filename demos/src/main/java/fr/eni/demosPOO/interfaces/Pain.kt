package fr.eni.demosPOO.interfaces

class Pain(val type : String) : Mangeable {
    override fun manger() {
        super.manger()
        println("C'est super bon !")
    }
}