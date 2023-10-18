interface Lis<P>{
    operator fun get(index:Int):P
}

class LongList:Lis<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<P>:Lis<P>{
    override fun get(index: Int): P {
        return this[index]
    }
}

fun main() {
    val la = ArrayList<Long>()
    val fi = la.get(0)
}