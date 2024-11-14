package klotlinBasico

fun main(args: Array<String>) {
    val idade = 150

    when(idade){
      in 1..17 -> println("você é menor")
      in 18 .. 29 ->  println("você é Jovem")
        in 30..60 -> println("você é um Senhor")
        else -> println("Melhor idade")
    }
}

   /* if (idade in 1..17){
        println("você é menor")
    }else if (idade in 18..28){
        println("você é Jovem")
    }else if (idade in 30..60){
        println("você é um Senhor")
    }
}
*/

