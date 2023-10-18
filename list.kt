data class pro(val x:String,val y: Int)

fun main() {
    val numberlist = listOf(1,2,3,4,5)
    val charlist = listOf('a','b','c')
    val alllist = listOf('a',false,2,"string",pro("x",1))
    println(alllist[4])

    //mutablelist
    val z = mutableListOf(1,2,3,4,5,false)
    z.add(6)
    z.add(1,10)
    z[5] = true
    z.removeAt(0)
    println(z[4])
    println(z)



}