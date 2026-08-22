fun main() {
    print("Digite a temperatura em Fahrenheit: ")
    val fahrenheit = readln().toDouble()

    val celsius = (fahrenheit - 32) * (5.0 / 9.0)

    println("A temperatura em Celsius é: $celsius")
}