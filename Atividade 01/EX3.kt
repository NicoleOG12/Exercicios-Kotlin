fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val num2 = readLine()!!.toDouble()

    val multiplicacao = num1 * num2

    println("A multiplicação dos números é: $multiplicacao")
}