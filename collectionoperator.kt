fun main() {
    val numberlist = listOf(1,2,3,4,5,6,7,8,9,10)
    val filterlist = numberlist.filter { it % 2 == 0 }
    println(filterlist)
    val filternotlist = numberlist.filterNot { it % 2 == 0 }
    println(filternotlist)
    val maplist = numberlist.map { it * 5 }
    println(maplist)
    val countlist = numberlist.count()
    println(countlist)
    println(numberlist.count{it % 3 == 0})
    println(numberlist.find{ it % 2  == 0 })
    println(numberlist.firstOrNull{it / 2 == 0})
    println(numberlist.lastOrNull{it / 2 == 0})
    println(numberlist.first{it   > 2})
    println(numberlist.last{it / 2 == 0})

    println(numberlist.sum())
    val lest = listOf('a','b','d','v','s','a')
    val lest_result = lest.sorted()
    val result_lest = lest.sortedDescending()
    println(lest_result)
    println(result_lest)
}