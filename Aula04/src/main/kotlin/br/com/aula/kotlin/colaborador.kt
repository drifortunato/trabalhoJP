class Colaborador(var salario: Float, nome: String, peso: Float, altura: Float): Pessoa3(nome, peso, altura){
    val ativo = true
    fun bonus() = salario > 0
}