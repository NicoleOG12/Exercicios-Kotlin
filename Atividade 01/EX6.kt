fun main() {
    print("Digite o raio da lata: ")
    val raio = readln().toDouble()

    print("Digite a altura da lata: ")
    val altura = readln().toDouble()

    val volume = 3.14159 * raio * raio * altura

    println("O volume da lata de óleo é: $volume")
}