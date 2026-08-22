fun main() {
    print("Digite a cotação do dólar: ")
    val cotacao = readln().toDouble()

    print("Digite a quantidade de dólares: ")
    val dolares = readln().toDouble()

    val reais = cotacao * dolares

    println("O valor em reais é: R$ $reais")
}