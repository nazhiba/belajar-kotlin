fun main() {
    val d= a()
    println("Nama: ${d.n}")
    d.n = "tiktok"
    println("Nama: ${d.n}")
}

class a{
    var n:String = "dcoding nadzib"
        get(){
            println("Fungsi getter terpangil")
            return field
        }
        set(v) {
            println("Fungsi Setter terpangil")
            field = v
        }

}

