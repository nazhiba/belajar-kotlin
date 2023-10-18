fun main() {
//    val an = Hewan("Ular",10,4.1)
}

abstract class Hewan(var n:String, var o:Int, var p:Double){
    fun m(){
        println("$n merupakan hewan berbisa")
    }
    fun q(){
        println("$n bukan merupakan hewan berbisa")
    }
}