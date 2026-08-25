fun main() {
    print("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    print("Digite o terceiro número: ")
    val num3 = readln().toInt()

    val numeros = listOf(num1, num2, num3).sorted()

    println("Os números em ordem crescente são: ${numeros.joinToString(", ")}")
}