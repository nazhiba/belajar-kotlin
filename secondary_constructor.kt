import java.util.WeakHashMap



class anime(nama:String,kelas:String,umur:Int,tinggi:Double){
    val nama:String
    val kelas:String
    val umur:Int
    val tinggi:Double
    var apakahmamalia:Boolean
    init {
        this.kelas = kelas
        this.tinggi = if (tinggi < 0) 0.1 else tinggi
        this.umur = if (umur < 0) 0 else umur
        this.nama = nama
        this.apakahmamalia = false
    }
    constructor(nama: String, umur: Int, kelas: String, tinggi: Double,apakahmamalia:Boolean) : this(nama,kelas,umur, tinggi){
        this.apakahmamalia = apakahmamalia
    }

}

fun main() {
    val X = anime("Nazhiif HIbatulloh", "TKJ A", 60, 12.0)
    println("${X.nama},${X.umur},${X.tinggi},${X.kelas},${X.apakahmamalia}")

}