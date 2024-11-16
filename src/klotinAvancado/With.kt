package klotinAvancado

import Pessoa

fun main() {
    val pessoas = Pessoa(2021, "Isaias Batista")
    pessoas.dormir()
    pessoas.acordar()

    with(pessoas){
        acordar()
        dormir()

    }


}