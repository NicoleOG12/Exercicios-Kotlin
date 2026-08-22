fun main() {
    print("Digite o valor da prestação: ")
    val valor = readln().toDouble()

    print("Digite a taxa de juros (%): ")
    val taxa = readln().toDouble()

    print("Digite o tempo de atraso: ")
    val tempo = readln().toDouble()

    val prestacao = valor + (valor * (taxa / 100) * tempo)

    println("O valor da prestação em atraso é: $prestacao")
}