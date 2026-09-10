/* crie um programa que leia um número inteiro e informe se ele é ou não um número primo*/

fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()
    
    if (numero < 2) {
        println ("$numero não é um número primo.")
        return
    }

    var Primo = true
    for (i in 2..Math.sqrt(numero.toDouble()).toInt()) {
        if (numero % i == 0) {
            Primo = false
            break
        }
    }
    if (Primo) {
        println("$numero é um número primo.")
    } else {
        println("$numero não é um número primo.")
    }
}