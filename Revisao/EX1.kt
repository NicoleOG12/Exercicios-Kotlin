/*crie um programa que leia a idade de uma pessoa e informe sua classificação
0 a 12anos: Criança
13 a 17 anos: Adolescente
18 a 59 anos: Adulto
60 anos ou mais: Idoso*/

fun main() {
	print("Digite sua idade: ")
	val idade = readln().toInt()

	val classificacao = when {
		idade in 0..12 -> "Criança"
		idade in 13..17 -> "Adolescente"
		idade in 18..59 -> "Adulto"
		idade >= 60 -> "Idoso"
		else -> "Idade inválida"
	}

	println(classificacao)
}