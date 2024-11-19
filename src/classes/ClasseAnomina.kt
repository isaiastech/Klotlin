package classes

interface Event{
    fun onSuccess()
}

class Programa{
    fun salvar(e:Event){
        println("Abrindo conexões")
        println("Salvando Valores")
        println("Sucesso. Conexão fechadas")
        e.onSuccess()

    }
}

fun main(){
    val p = Programa()
    p.salvar(object : Event {
        override fun onSuccess() {
            println("onSuccess")
        }
    })

}

