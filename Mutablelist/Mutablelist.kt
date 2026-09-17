fun main() {
    val produtos = mutableMapOf(
        "Teclado",
        "Mouse",
        "Monitor",
    )

    produtos.add("Headset")
    produtos.add("Mouse")
    produtos[0] = "Teclado Mecânico"

    println("Produtos: $produtos")
}
