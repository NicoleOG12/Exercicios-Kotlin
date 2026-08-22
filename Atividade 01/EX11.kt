fun main() {
    print("Digite o valor de A: ")
    var a = readln().toInt()

    print("Digite o valor de B: ")
    var b = readln().toInt()

    val temp = a
    a = b
    b = temp

    println("Valor de A após a troca: $a")
    println("Valor de B após a troca: $b")
}