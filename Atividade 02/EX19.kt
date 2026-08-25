fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readln().toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readln().toDouble()

    print("Digite a terceira nota: ")
    val nota3 = readln().toDouble()

    print("Digite a quarta nota: ")
    val nota4 = readln().toDouble()

    val media = (nota1 + nota2 + nota3 + nota4) / 4

    if (media >= 7) {
        println("Aluno aprovado!")
        println("Média: $media")
    } else {
        println("Aluno não aprovado.")
        println("Média: $media")
    }
}