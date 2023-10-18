import kotlin.random.Random

fun main() {
    val value = 6
    val spasi = "==========================="

    when(value){
        6 -> {
            val namadepan = "nazhiif"
            val namabelakang = "hibatulloh"
            println("$namadepan $namabelakang")
        }
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")

    }
    println(spasi)
    val stringofvalue = when (value){
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"

        else -> "Tidak ditemukan atau eror"


    }
    println(stringofvalue)
    println(spasi)
    val anytype : Any = 100L
    when(anytype){
        is Long -> println("the value is a long type")
        is String -> println("the value is a String type")
        else -> println("undefined")
    }
    println(spasi)
    val _value = 27
    val ranges = 10..50
    when(_value){
        in ranges ->  println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
    println(spasi)
    val registernumber = when(val ragis = getregisternumber()){
        in 1..50 -> 50 * ragis
        in 51 .. 100 -> 100 * ragis
        else -> ragis

    }
    println(registernumber)


}

fun getregisternumber() = Random.nextInt(100)