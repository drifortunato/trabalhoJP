fun main() {
    val p1 = Pessoa3("Maria", 60f, 1.70f)
    val p2 = Colaborador(2000f,"Joaquim", 70f, 1.75f)
    val p3 = Cliente(1.500f,"Marcos", 80f, 1.80f)
    println("${p1.nome} tem imc = ${p1.imc()}")
    println("${p2.nome} tem imc = ${p2.imc()} e ${if (p2.ativo) "está ativo" else "foi despedido"}")
    println("${p3.nome} tem imc = ${p3.imc()} e renda = ${p3.renda}")
}

open class Pessoa3(val nome: String, val peso: Float, val altura: Float){
    fun imc() = peso / (altura*altura)

}



