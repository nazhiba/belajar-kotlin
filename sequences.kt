fun main() {
    val spasi = "======================================"
    val list = (1..1000000).toList()
    list.asSequence().filter { it % 2 == 0 }.map { it * 2 }.forEach { println(it) }
    println(spasi)
    val sequencenumber = generateSequence(1) {it + 1}
    sequencenumber.take(5).forEach { println("$it") }

}