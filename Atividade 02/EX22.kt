fun main() {
    print("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    print("Digite o terceiro número: ")
    val num3 = readln().toInt()

    val maior = maxOf(num1, num2, num3)

    println("O maior número é: $maior")
}