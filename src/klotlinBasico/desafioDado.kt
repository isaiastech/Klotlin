package klotlinBasico

fun main() {
    print("Escolha um número entre 0 e 6? ")
    val palpite = readLine()?.toInt()!!
    val dado = (1..6).random()
    println("Palpite: $palpite")
    println("O número soreteado foi: $dado")
    when(palpite == dado){
        true -> println("Você acertou o número")
        false -> println("Você errou !!")
    }

}

