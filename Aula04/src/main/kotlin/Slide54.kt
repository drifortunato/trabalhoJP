fun main() {
    val p1 = Pessoa5("Maria", 60f, 1.70f)
    val p2 = Pessoa5("Joaquim", 70f, 1.75f)
    val p3 = Pessoa5("Marcos", 80f, 1.80f)
    println(p1)
    println(p2)
    println(p3.toString())
}

open class Pessoa5(val nome: String, val peso: Float, val altura: Float){
    override fun toString(): String {
        return "$nome $peso $altura"
    }
}