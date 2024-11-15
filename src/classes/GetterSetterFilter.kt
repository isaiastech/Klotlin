package classes

class GetterSetterFilter(var especie:String) {
    var fala: String = ""
        get() {
            println("Acesso get")
            return  field
        }
        set(value){
            println("Acesso Set")
            field=value
        }
}

fun main() {
    var especieAnimal = "Gato"
    var  a = GetterSetterFilter(especieAnimal)
    a.fala = buildString {
        append("okay")
    }

}