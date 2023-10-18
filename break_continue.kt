fun main() {
    val spasi = "==========================="
    val listofint = listOf(1,2,3,null,5,null,7)
    loop@for (i in listofint) {
        if (i == null) break@loop
        println(i)
    }
    println(spasi)
    loop@for (x in 1..10) {
        println("outside loop $x")
            for(y in 1..10) {
                println("inside loop $y")
                if (y > 5) break@loop
            }


    }
    println(spasi)
}