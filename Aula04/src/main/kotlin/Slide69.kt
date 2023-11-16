import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    var r : Any = "s"
    var t = 0f
    do{
        print("Digite um numero inteiro ou 'S' para sair.")
        try {
            r = readLine()!!
            if (r == "S")
                break
            t += r.toInt()
        }
        catch (e: NumberFormatException){
            println("   Número inválido, tente novamente!")
        }
        catch (e: Exception){
            println("  !!! Houve um exceção !!!")
        }
        finally {
            println("Total Parcial: $t")
        }
    }while (r != "S")
}