fun main() {
//
//    class X(override val n:Int):Indo{
//        override fun f() {
//            if (n > 0) println("terbang dengan $n sayap") else println("Saya terbang tanpa sayap")
//        }
//    }

    fly(object : Indo{
        override fun f() {
            if (n > 0) println("Terbang dengan $n sayap")
            else println("terbang tanpa sayap")
        }

        override val n: Int
            get() = 10
    })

//    fly(X(2))
}

interface Indo{
    fun f()
    val n:Int
}


fun fly(b : Indo){
        b.f()
}

