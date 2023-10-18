fun main() {
    val d = ann("Nazhiif Hibatulloh",173.0, 19, true)
    println(d.info)

}

class ann(var nama:String, var tinggi:Double, var umur:Int, var animal:Boolean)
val ann.info :String
    get() = "Nama:${this.nama}, Tinggi:${this.tinggi}, Umur:${this.umur}, StatusAnimal:${this.animal}"
