package estruturaRepeticao

fun main() {
    val number = arrayListOf<Int>()
    var tamanho = 0
    while ( number.size != 10){
        number.add(tamanho++)
        println("Valor: ${number.size}")
    }
}