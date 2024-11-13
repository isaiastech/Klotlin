fun main(args: Array<String>) {
   print("Digite sua nota: ")
    val x = readLine()?.toInt()!!

    if (x<= 4) {
        println("Reprovado")
    }else if (x > 11 && x < 20){
        println("Aprovado")
    }else if (x > 5 && x<= 8) {
        println("Exame")
    }else{
        println("Nota inválida !!")
    }

}

