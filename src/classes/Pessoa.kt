class Pessoa(val anoNascimento: Int, var nome:String) {
    var olhos:String="Verdes"

    fun dormir(): Unit {

    }
    fun acordar(): Unit {

    }


}

fun main() {
    // classe sempre como com letra maiúscula
    // classe gera objetos
    val pessoa: Pessoa = Pessoa(
        2020,
        "marcelo Silva"
    )
    val  nome = pessoa.nome
    val olhos = pessoa.olhos
    println(olhos)


}