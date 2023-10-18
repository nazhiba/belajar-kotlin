fun main() {
    val spasi = "==========================="
    val list = setOf(1,2,1,3,4,3,4)
    val list2 = setOf(1,2,3,4)
    println(list == list2)
    println(spasi)
    println(4 in list)
    println(spasi)
    val list3 = setOf(5,6,7)
    val union = list.union(list3)
    val intersec = list.intersect(list3)

    println(union)
    println(intersec)
    println(spasi)
    val capital = mapOf(
        "jakarta" to "indonesia",
        "big mom" to "+",
        "kaido" to "wano"
    )
    println(capital["jakarta"])
    println(capital.getValue("jakarta"))
    println(capital.keys)
    println(capital.values)

}
