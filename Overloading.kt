fun main() {
    val C = calculator()
    println(C.add(1,1))
    println(C.add(1.2,3.3))
    println(C.min(2,4))
}

class calculator{
    fun add(v1:Int, v2: Int) = v1 + v2
    fun add(v1:Int, v2:Int, v3:Int) = v1 + v2 + v3
    fun add(v1:Double, v2:Double) = v1 + v2
    fun add(v1:Float, v2:Float) = v1 + v2

    fun min(v1:Int,v2:Int) = if (v1 < v2) v1*v2 else v2
    fun min(v1: Double, v2: Double) = if (v1 < v2) v1 else v2
}