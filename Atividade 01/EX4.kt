fun main() {
    print("Digite a temperatura em Celsius: ")
    val celsius = readln().toDouble()

    val fahrenheit = (9 * celsius + 160) / 5

    println("A temperatura em Fahrenheit é: $fahrenheit")
}