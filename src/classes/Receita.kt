package classes

class Receita {
   lateinit var intrucoes:String

    fun geraReceita(){
        intrucoes = "Lave as mãos"
    }

    fun imprimeReceitas(){
        if (!this::intrucoes.isInitialized){
            intrucoes = "Lave as mãos"
        }
    }
}
