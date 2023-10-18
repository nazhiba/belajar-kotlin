fun main() {
    val somestring = "Lemoot"
    val s = "123"
    val so = s.toInt()
    val ss = "12.12"
    val sd = ss.toDouble()

    println(somestring.reversed())
    println(somestring.toUpperCase())
    println(somestring.toLowerCase())
    println(so is Int)
    println(sd is Double)
}