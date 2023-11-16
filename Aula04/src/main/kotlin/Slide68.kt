//fun main() {
//    var a : Any = '1'
//    var resultado = when (a) {
//        is String -> "$a é um Texto"
//        is Int -> "$a é um numero"
//        else -> "Não sei"
//    }
//
//    println(resultado)
//    println(a::class.simpleName)
//}

fun main() {
    var a : Any = 'A'
    var resultado = when (a) {
        is String -> "$a é um Texto"
        is Int -> "$a é um numero"
        else -> "Não sei"
    }

    println(resultado)
    println(a::class.simpleName)
}

//Trabalhando com Smart Cast