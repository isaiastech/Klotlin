package classes

enum class Enumeradora(val values:Int){
    Baixa(2){
        override fun toString(): String {
            return "Prioridade Baixa : $values"
        }
    },
    Media(4),
    Alta(6)

}

fun main() {
    for (m in Enumeradora.values()){
        println(m)
    }
}