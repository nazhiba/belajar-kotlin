

fun main() {
    val o = _sum(1,2,3)
    println(o)

}

fun x(message:String){
        fun y(text:String){
            println(text)
            println(message)
            fun z(){

            }
            z()

        }
    println(message)
}


fun sum(a: Int, b: Int, c: Int): Int{
    if (a == 0){
        throw IllegalArgumentException("A harus lebih kecil dari 0")
    }
    if (b == 0){
        throw IllegalArgumentException("B harus lebih kecil dari 0")
    }
    if (c ==  0){
        throw IllegalArgumentException("C harus lebih kecil dari 0")
    }

    return a + b + c
}


fun _sum(a: Int, b:Int, c:Int): Int {
    fun v(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("jawaban harus dibawah 0")
        }
    }
    v(a)
    v(b)
    v(c)
    return a+b+c
}