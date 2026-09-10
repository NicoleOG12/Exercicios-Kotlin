/*faça um programa que solicite 10 números inteiros, ao final informe:
quantidade de números positivos
quantidade de números negativos
quantidade de números zeros*/

fun main() {
    val numeros = List(10) { indice ->
        print("Digite o ${indice + 1}º número inteiro: ")
        readln().toInt()
    }

    val positivos = numeros.count { it > 0 }
    val negativos = numeros.count { it < 0 }
    val zeros = numeros.count { it == 0 }

    println("-------------------------------------------")
    println("Quantidade de números positivos: $positivos")
    println("Quantidade de números negativos: $negativos")
    println("Quantidade de números zeros: $zeros")

}