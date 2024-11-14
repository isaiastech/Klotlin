package funcoes

fun main(args: Array<String>) {
    //val resultado = somar(5,45)
    var multiplicar = multiplicar(20,15)
    println(multiplicar)
}

fun somar(x:Int = 0, y:Int =0): Int{  //passando valor padrão
    val resultado  = x + y
    return  resultado

}

fun multiplicar(x: Int, y: Int):Int {
    var i = x * y
    return i
}

