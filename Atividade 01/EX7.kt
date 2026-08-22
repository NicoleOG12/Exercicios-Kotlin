fun main() {
    print("Digite sua idade em anos: ")
    val anos = readln().toInt()

    print("Digite os meses: ")
    val meses = readln().toInt()

    print("Digite os dias: ")
    val dias = readln().toInt()

    val totalDias = (anos * 365) + (meses * 30) + dias

    println("Sua idade em dias é: $totalDias dias")
}