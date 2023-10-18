data class Usir(val name: String,val age: Int)

fun main() {
    val spasi = "==========================="
    val profile1 = Usir("admin",15)
    val profile2 = Usir("rokib",12)
    val profile3 = Usir("atit",12)
    val profile4 = profile1.copy()
    println(profile4)
    println(spasi)
    val profile5 = profile1.copy(age = 2)
    println(profile5)

}