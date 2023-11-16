//fun main() {
//    val p1 = Pessoa2("Maria", 60f, 1.70f)
//    val p2 = Pessoa2("Joaquim", 70f, 1.75f)
//    val p3 = Pessoa2("Marcos", 80f, 1.80f)
//    println("${p1.nome} tem imc = ${p1.imc()}")
//    println("${p2.nome} tem imc = ${p2.imc()}")
//    println("${p3.nome} tem imc = ${p3.imc()}")
//}
//
//public final class Pessoa2(val nome: String, val peso: Float, val altura: Float){
//    fun imc() = peso / (altura*altura)
//}

fun main() {
    val p1 = Pessoa2("Maria", 60f, 1.70f)
    val p2 = Pessoa2("Joaquim", 70f, 1.75f)
    val p3 = Pessoa2("Marcos", 80f, 1.80f)
    println("${p1.nome} tem imc = ${p1.imc()}")
    println("${p2.nome} tem imc = ${p2.imc()}")
    println("${p3.nome} tem imc = ${p3.imc()}")
}

public final class Pessoa2(val nome: String, val peso: Float, val altura: Float){
    fun imc() = peso / (altura*altura)
}