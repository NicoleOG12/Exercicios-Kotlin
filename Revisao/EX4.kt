/*crie um programa que solicite dois números inteiros: um valor inicial e um valor final.
O programa deverá aprsentar a soma de todos os números existentes entre os dois valores, incluindo os limites*/

fun main() {
    print("Digite o valor inicial: ")
    val valorInicial = readln().toInt()

    print("Digite o valor final: ")
    val valorFinal = readln().toInt()

    if (valorInicial > valorFinal) {
        println("Valor inicial não pode ser maior que o valor final.")
        return
    }

    val soma = (valorInicial..valorFinal).sum()
    println("A soma de todos os números entre $valorInicial e $valorFinal é: $soma")
}
 