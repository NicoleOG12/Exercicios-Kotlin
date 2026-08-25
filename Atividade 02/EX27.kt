fun main() {
    println("========== CARDÁPIO ==========")
    println("100 - Cachorro quente    R$ 1,20")
    println("101 - Bauru simples      R$ 1,30")
    println("102 - Bauru com ovo      R$ 1,50")
    println("103 - Hambúrguer         R$ 1,20")
    println("104 - Cheeseburguer      R$ 1,30")
    println("105 - Refrigerante       R$ 1,00")
    println("==============================")

    print("Digite o código do item: ")
    val codigo = readln().toInt()

    val nome: String
    val preco: Double

    when (codigo) {
        100 -> {
            nome = "Cachorro quente"
            preco = 1.20
        }
        101 -> {
            nome = "Bauru simples"
            preco = 1.30
        }
        102 -> {
            nome = "Bauru com ovo"
            preco = 1.50
        }
        103 -> {
            nome = "Hambúrguer"
            preco = 1.20
        }
        104 -> {
            nome = "Cheeseburguer"
            preco = 1.30
        }
        105 -> {
            nome = "Refrigerante"
            preco = 1.00
        }
        else -> {
            println("Código inválido!")
            return
        }
    }

    print("Digite a quantidade: ")
    val quantidade = readln().toInt()

    val total = preco * quantidade

    println()
    println("========== PEDIDO ==========")
    println("Item: $nome")
    println("Quantidade: $quantidade")
    println("Valor unitário: R$ %.2f".format(preco))
    println("Valor total: R$ %.2f".format(total))
    println("============================")
}