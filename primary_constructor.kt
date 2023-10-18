fun main() {
    val main = ass("jokowi", 160.0, 67, true)
    val init = primary("maruf amin", 155.0, 70, true)
    println("Nama:${init._name}, Tinggi:${init._weight}, Umur:${init._age}, Apakah Mamalia:${init._mamalia}")
    println("Nama:${main.nama}, Tinggi:${main.tinggi}, Umur:${main.umur} Apakahmamalia:${main.apakahmamalia}")
}

class ass(val nama:String = "tanpa nama" , val tinggi:Double = 0.0, val umur:Int = 0, val apakahmamalia: Boolean = true)


class primary(xname:String, xweight:Double, xage:Int, xmamalia:Boolean){
        val _name:String
        val _weight:Double
        val _age:Int
        val _mamalia:Boolean

        init {
            this._weight = if (xweight < 0) 0.1 else xweight
            this._age = if (xage < 0) 0 else xage
            this._name = xname
            this._mamalia = xmamalia
        }

}
