package classes

class Pessoa2(val anoNascimento: Int, var nome:String, var documento:Int) {

    fun dormir(): Unit {

    }
    fun acordar(): Unit {

    }


}

fun main() {
    var pessoa2 = Pessoa2(2023, "Pedro Costa",2666)
    pessoa2.acordar()
   

println("Meu nome é ${pessoa2.nome} meu documento é ${pessoa2.documento}")

}