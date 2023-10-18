fun main() {
    val t = listOf(1,2,3,4,5,6,7,8,9,0)
    val xx = listOf(1,1,1,2,2,2,2,33,4,4,5,6,7,8)
    val i = listOf(2,5,6)
    val s = t.slice(3..6)
    val S = t.slice(3..6 step 2)
    val SS = t.slice(i)
    val d = xx.distinct()




    println(s)
    println(S)
    println("SS" + SS)
    println("distince"+d)
    dis.forEach {
        println("${it.k} dengan jawaban ${it.V}")
    }


    println(D)
    println(c)
    println(CC)

}


data class I(val k:String,val V:Any)
val i = listOf(
    I("1","kotlin"),
    I("2","is"),
    I("3","not"),
    I("3","easy")


)
val dis = i.distinctBy { it.k }

val TT = listOf("A","B","CC","EEEE")
val D = TT.distinctBy{it.length}
val w = "QWERTY"
val c = w.chunked(3)
val CC = w.chunked(3){
    it.toString().toLowerCase()
}






