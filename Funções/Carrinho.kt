/*Uma loja precisa calcular informações sobre uma compra realizada por um cliente. A compra pode conter uma quantidade variável de produtos.
Crie um programa que deverá:
-receber os produtos da compra;
-calcular o valor total da compra;
-retornar o valor total da compra;
-a quantidade de produtos;
-o produto de maior valor.*/

data class Produto(
    val nome: String,
    val preco: Double
)

data class ResultadoCompra(
    val total: Double,
    val quantidade: Int,
    val maiorProduto: Produto
)

fun calcularCompra(vararg produtos: Produto): ResultadoCompra {
    var total = 0.0
    var maiorProduto = produtos[0]

    for (produto in produtos) {
        total += produto.preco
        if (produto.preco > maiorProduto.preco) {
            maiorProduto = produto
        }
    }

    val quantidade = produtos.size

    return ResultadoCompra(
        total,
        quantidade,
        maiorProduto
    )
}

fun main() {
    val resultado = calcularCompra(
        Produto("Morango Cravejado", 15.0),
        Produto("Feijoada", 80.0),
        Produto("Poke", 50.0),
        Produto("Caldo verde", 25.0)
    )

    println("Total: R$ ${resultado.total}")
    println("Quantidade: ${resultado.quantidade}")
    println("Maior Produto: ${resultado.maiorProduto.nome} - R$ ${resultado.maiorProduto.preco}")
}
