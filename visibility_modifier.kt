fun main() {
    val XYZ = Anim("Kotlin is easy", 12, 12.0)
    println(XYZ.G_name())
    XYZ.S_name("Kotlin is not easy")
    println(XYZ.G_name())
    val c = cat("Kucing", 22.0)
    println("nama kucing ${c.nm}")
//    println("berat ${c.ww}")
}


class Anim(private var X:String, private val Y:Int, private val Z:Double){
    fun G_name():String{
        return X
    }
    fun S_name(N_name : String){
        X = N_name
    }
}

open class A(val nm:String, protected val ww:Double)
class cat(pName:String, pww:Double) : A(pName, pww )

internal class AN(val name:String)

