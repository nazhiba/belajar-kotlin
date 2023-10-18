fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value.Slice)
    println(value1.Slice)
}


val Int?.Slice: Int
    get() = this?.div(2) ?: 0

