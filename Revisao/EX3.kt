/*crie um programa que leia um número inteiro positivo e faça uma contagem regressiva até zero*/

fun main() {
    print("Digite um número inteiro positivo: ")
    val numero = readln().toInt()

    if (numero < 0) {
        println("Número inválido. Por favor, digite um número inteiro positivo.")
        return
    }

    println("Contagem regressiva:")
    for (i in numero downTo 0) {
        println(i)
        Thread.sleep(1000)
    }

    
}