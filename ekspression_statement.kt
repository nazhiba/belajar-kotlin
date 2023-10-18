fun main() {
    val spasi = "==========================="
    val officeOpen = 5
    val officeClose = 15
    val me = 12
    val office = if (officeOpen < me && me < officeClose) "Office buka" else "office tutup"
    println(office)
    println(spasi)
    sum(1, 1*5)


    println(spasi)
    val value1 = 10
    val value2 = 10
    _sum(value1,value2)

}
fun sum(value1: Int, value2: Int) = value1 + value2
fun _sum(value1: Int,value2: Int) = value1 + value2