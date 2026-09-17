/* O professor precisa de um programa para calcular as notas dos alunos
O programa deverá acessar:
-cadastrar as notas dos alunos, associando cada aluno ao seu código
-permitir consultar a nota de um aluno pelo código
-permitir alterar uma nota cadastrada
-apresentar todos os alunos e suas respectivas notas
-informar a quantidade de alunos cadastrados
-calcular a média da turma
-informar a maior e menor nota
-apresentar os alunos que possuem nota igual ap superior 7,0
-apresentar tambem as diferentes notas que foram utilizadas na turma, sem repetir valores.*/

val notasAlunos = mutableMapOf<String, Double>()

val ROSA = "\u001B[95m"
val CIANO = "\u001B[96m"
val RESET = "\u001B[0m"

fun cadastrarNota(codigo: String, nota: Double) {
    notasAlunos[codigo] = nota
    println("\n${ROSA}✓ ALUNO CADASTRADO${RESET}")
    println("${CIANO}Código: $codigo | Nota: %.1f${RESET}".format(nota))
}

fun consultarNota(codigo: String) {
    val nota = notasAlunos[codigo]
    println("\n${ROSA}========== CONSULTA ==========${RESET}")
    if (nota != null) {
        println("${CIANO}Aluno: $codigo${RESET}")
        println("${CIANO}Nota: %.1f${RESET}".format(nota))
    } else {
        println("${ROSA}Aluno com código $codigo não encontrado.${RESET}")
    }
    println("${ROSA}==============================${RESET}")
}

fun alterarNota(codigo: String, novaNota: Double) {
    if (notasAlunos.containsKey(codigo)) {
        notasAlunos[codigo] = novaNota
        println("\n${ROSA}✓ NOTA ALTERADA${RESET}")
        println("${CIANO}Aluno: $codigo | Nova nota: %.1f${RESET}".format(novaNota))
    } else {
        println("\n${ROSA}Aluno com código $codigo não encontrado.${RESET}")
    }
}

fun apresentarNotas() {
    if (notasAlunos.isEmpty()) {
        println("\n${ROSA}Nenhum aluno cadastrado.${RESET}")
        return
    }

    println("\n${ROSA}╔════════════════════════════╗${RESET}")
    println("${ROSA}║      ALUNOS E NOTAS        ║${RESET}")
    println("${ROSA}╠════════════════════════════╣${RESET}")

    for ((codigo, nota) in notasAlunos) {
        println("${CIANO}║  Código: %-10s Nota: %4.1f ║${RESET}".format(codigo, nota))
    }

    println("${ROSA}╚════════════════════════════╝${RESET}")
}

fun quantidadeAlunos() {
    println("\n${ROSA}========== QUANTIDADE ==========${RESET}")
    println("${CIANO}Alunos cadastrados: ${notasAlunos.size}${RESET}")
    println("${ROSA}================================${RESET}")
}

fun calcularMedia() {
    if (notasAlunos.isEmpty()) {
        println("\n${ROSA}Nenhum aluno cadastrado.${RESET}")
        return
    }

    val media = notasAlunos.values.average()

    println("\n${ROSA}========== MÉDIA DA TURMA ==========${RESET}")
    println("${CIANO}Média: %.2f${RESET}".format(media))
    println("${ROSA}=====================================${RESET}")
}

fun maiorEMenorNota() {
    if (notasAlunos.isEmpty()) {
        println("\n${ROSA}Nenhum aluno cadastrado.${RESET}")
        return
    }

    val maior = notasAlunos.values.max()
    val menor = notasAlunos.values.min()

    println("\n${ROSA}======= MAIOR E MENOR NOTA =======${RESET}")
    println("${CIANO}Maior nota: %.1f${RESET}".format(maior))
    println("${CIANO}Menor nota: %.1f${RESET}".format(menor))
    println("${ROSA}==================================${RESET}")
}

fun alunosComNotaSuperiorA7() {
    val aprovados = notasAlunos.filter { it.value >= 7.0 }

    if (aprovados.isEmpty()) {
        println("\n${ROSA}Nenhum aluno com nota igual ou superior a 7,0.${RESET}")
        return
    }

    println("\n${ROSA}====== ALUNOS COM NOTA >= 7,0 ======${RESET}")

    for ((codigo, nota) in aprovados) {
        println("${CIANO}Código: $codigo | Nota: %.1f${RESET}".format(nota))
    }

    println("${ROSA}=====================================${RESET}")
}

fun diferentesNotas() {
    val notas = notasAlunos.values.toSet()

    println("\n${ROSA}========= NOTAS DISTINTAS =========${RESET}")
    println("${CIANO}$notas${RESET}")
    println("${ROSA}===================================${RESET}")
}

fun main() {
    var opcao: Int

    do {
        println("\n${ROSA}╔══════════════════════════════╗${RESET}")
        println("${ROSA}║       SISTEMA DE NOTAS       ║${RESET}")
        println("${ROSA}╠══════════════════════════════╣${RESET}")
        println("${CIANO}║  1 - Cadastrar aluno          ║${RESET}")
        println("${CIANO}║  2 - Consultar nota           ║${RESET}")
        println("${CIANO}║  3 - Alterar nota             ║${RESET}")
        println("${CIANO}║  4 - Listar todos os alunos   ║${RESET}")
        println("${CIANO}║  5 - Quantidade de alunos     ║${RESET}")
        println("${CIANO}║  6 - Média da turma           ║${RESET}")
        println("${CIANO}║  7 - Maior e menor nota       ║${RESET}")
        println("${CIANO}║  8 - Alunos com nota >= 7,0   ║${RESET}")
        println("${CIANO}║  9 - Notas distintas          ║${RESET}")
        println("${ROSA}║  0 - Sair                     ║${RESET}")
        println("${ROSA}╚══════════════════════════════╝${RESET}")

        print("${CIANO}Escolha uma opção: $RESET")
        opcao = readln().toInt()

        when (opcao) {
            1 -> {
                print("${CIANO}Digite o código do aluno: $RESET")
                val codigo = readln()
                print("${CIANO}Digite a nota do aluno: $RESET")
                val nota = readln().toDouble()
                cadastrarNota(codigo, nota)
            }

            2 -> {
                print("${CIANO}Digite o código do aluno: $RESET")
                val codigo = readln()
                consultarNota(codigo)
            }

            3 -> {
                print("${CIANO}Digite o código do aluno: $RESET")
                val codigo = readln()
                print("${CIANO}Digite a nova nota: $RESET")
                val novaNota = readln().toDouble()
                alterarNota(codigo, novaNota)
            }

            4 -> apresentarNotas()
            5 -> quantidadeAlunos()
            6 -> calcularMedia()
            7 -> maiorEMenorNota()
            8 -> alunosComNotaSuperiorA7()
            9 -> diferentesNotas()
            0 -> println("\n${ROSA}Programa encerrado. Até mais!${RESET}")
            else -> println("\n${ROSA}Opção inválida! Tente novamente.${RESET}")
        }

    } while (opcao != 0)
}

