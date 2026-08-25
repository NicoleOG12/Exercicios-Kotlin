fun main() {
    print("Digite o primeiro número: ")
    val num1 = readln().toInt()

    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    print("Digite o terceiro número: ")
    val num3 = readln().toInt()

    print("Digite o quarto número: ")
    val num4 = readln().toInt()

    print("Digite o quinto número: ")
    val num5 = readln().toInt()

    var maior = num1
    var menor = num1

    if (num2 > maior) maior = num2
    if (num3 > maior) maior = num3
    if (num4 > maior) maior = num4
    if (num5 > maior) maior = num5

    if (num2 < menor) menor = num2
    if (num3 < menor) menor = num3
    if (num4 < menor) menor = num4
    if (num5 < menor) menor = num5

    println("O maior valor é: $maior")
    println("O menor valor é: $menor")
}