import java.util.*

fun main() {
    val paises = arrayOf("Brasil", "lima ", "Peru", "Inglatera")
    val item = paises[1]
    val tamanho = paises.count()
    println(tamanho)

    paises.forEach {
        println("$it")
    }

    val posicao = Arrays.binarySearch(paises,"Peru")
    println(posicao)
}
