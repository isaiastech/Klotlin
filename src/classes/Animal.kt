package classes

class Animal(var especie:String) {
    var fala:String = ""
    init {
        fala = if (especie == "cachorro"){
            "au"
        }else (if (especie == "Gato"){
            "miau"
        }else{
            ""
        }).toString()

    }
    fun falar(){
        println(fala)
    }
}

fun main(){
    Animal("Gato").falar()
}