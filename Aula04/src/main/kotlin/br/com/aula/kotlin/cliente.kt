class Cliente(var renda:Float, nome:String, peso: Float, altura: Float): Pessoa3(nome, peso, altura){
    fun aprovacao() = renda > 1000
}