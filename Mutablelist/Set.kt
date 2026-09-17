fun main(){
    val categorias = setOf(
        "Informatica",
        "Eletronicos",
        "Informatica",
        "Acessorios",
    )

    categorias.add("Celulares")
    categorias.add("Informatica")

    println("Categorias: $categorias")
    priintln("Quantidade de categorias: ${categorias.size}")
}   