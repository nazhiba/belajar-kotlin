fun main() {
    val X = ASU("Monkey D.Luffy","Tokoh utama",170.2, 16, "Laki - Laki")
    X.K()


    val Y = Klasifikasi("Marshall D.Teach", "antagonis", 27, "laki - laki", 190.3)
    Y.O()
}

open class ASU(val nama:String, val genre:String, val tinggi: Double, val umur:Int, val jeniskelamin:String){
    open fun K(){
        println("$nama Hero yang bagus")
    }

    open fun O(){
        println("$nama hero yang busuk")
    }
}

class Klasifikasi(pnama:String, pgenre:String, pumur: Int, pjeniskelamin: String, ptinggi:Double):ASU(pnama, pgenre,ptinggi, pumur, pjeniskelamin){
    fun ceria(){
        println("$nama ceria")
    }

    override fun K() {
        println("$nama banyak fanas")
    }

    override fun O() {
        println("$nama banyak dibenci")
    }
}
