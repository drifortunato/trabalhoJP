//fun main() {
//    val nota = 4
//    var resultado = when {
//        (nota >= 6) -> "Aprovado"
//        (nota < 4) -> "Reprovado"
//        else -> "Recuperação"
//    }
//    println(resultado)
//}

//fun main() {
//    val nota = 4f
//    var resultado = when (nota) {
//        in 6f..10f -> "Aprovado"
//        in 4f..6f -> "Reprovado"
//        in 0f..4f -> "Recuperação"
//        else -> "Inválida"
//    }
//    println(resultado)
//}

fun main() {
    val nota = 10f
    var resultado = when (nota) {
        in 6f..10f -> "Aprovado"
        in 4f..6f -> "Reprovado"
        in 0f..4f -> "Recuperação"
        else -> "Inválida"
    }
    println(resultado)
}

//Testando When