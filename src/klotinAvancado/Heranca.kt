package klotinAvancado

import classes.Computador

fun main() {
    var c: Computador = Computador("Dell").also {
        it.ligar()
        it.desligar()
        it.processar()
        it.processar()
        it.marca

    }
}
