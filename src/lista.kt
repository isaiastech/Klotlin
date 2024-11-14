fun main() {
    val nome = listOf("Isaias", "pedro", "ivo", "João Carlos")
    println("$nome")

    val cidades:MutableList<String> = mutableListOf("Joaçaba", "Herval do Oeste", "Luzerna")
        cidades.add("São Joaquim")
    println(cidades)

    val Suco:MutableMap<String, Int> = mutableMapOf("laranja" to 50, "Banana" to 45, )
    println(Suco)

    val color = arrayListOf("red", "white", "blue")
    color.add("green")
    color.add("yellow")
    color.remove("white")
    println(color)
    


}
