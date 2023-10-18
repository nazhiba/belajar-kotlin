fun main() {
    println("fold results $f")
    println("fold results $g")
    println(dd)
    println(e)
    println("Take"+F)
    println("take last $G")
}
val o = listOf(1,2,7)
val n = listOf(1,2,3)
val p = listOf(1,5,6,0,2,7)
val dd = p.drop(3)
val e = p.dropLast(3)
val F = p.take(3)
val G = p.takeLast(2)
val f = n.fold(10){ current, item ->
    println("current $current")
    println("item $item")
    println()
    current+ item

}

val g = o.foldRight(10){item, current ->
    println("current $current")
    println("item $item")

    println()

    item + current
}
