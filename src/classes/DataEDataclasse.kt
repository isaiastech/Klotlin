package classes

class DataEDataclasse(val a:Int,val b:Int)
data class Forma(val x:Int,val y:Int )

fun main() {
    val f1: DataEDataclasse = DataEDataclasse(10,8)
    val f2: DataEDataclasse = DataEDataclasse(10,8)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("------------")
    println(f2.toString())
    println(f2.hashCode())
}