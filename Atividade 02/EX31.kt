import java.math.BigInteger

fun main() {
    print("Digite um número: ")
    val numero = readln().toInt()

    var fatorial = BigInteger.ONE

    for (i in 1..numero) {
        fatorial = fatorial.multiply(BigInteger.valueOf(i.toLong()))
    }

    println("O fatorial de $numero é: $fatorial")
}