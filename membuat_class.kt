fun main() {
    class animal(val nama:String,
                val weight:Double,
                val age: Int,
                val issmall: Boolean
    ){
        fun eat(){
            println("$nama makan!")
        }
        fun sleep(){
            println("$nama tidur!")
        }
    }
    val N = animal("kucing", 4.2,20,true)
    println("Nama: ${N.nama}\nBerat: ${N.weight}, Umur:${N.age}, Status Mamalia: ${N.issmall}")



}


