fun main() {
    val spasi = "==========================="

    val range = 1.rangeTo(10) step 2
    for(i in range){
        println("value is $i")
    }
    println(spasi)
    for((index, value) in range.withIndex()) {
        println("value $value with index $index")
    }
    println(spasi)
    range.forEach {value ->
        println("value is $value!")
    }
    println(spasi)
    range.forEachIndexed{index, value ->
        println("value $value with index $index")
    }
    println(spasi)
    range.forEachIndexed{index, _ ->
        println("index $index")
    }
    println(spasi)

}