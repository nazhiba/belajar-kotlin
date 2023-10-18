fun main() {
     val x = fac(3)
    println(x)
}

fun factorial(x: Int): Int{
    return if ( x == 1){
        x
    }else{
        var r = 1
        for (i in 1..x){
            r *= i
        }
        r
    }
}



fun fact(n: Int): Int{
        return if (n==1){
            n
        }else{
            n * fact(n - 1)
        }
}


tailrec fun fac(n: Int, rslt: Int = 1): Int {
    val new = n * rslt
    return if (n==1){
        new
    }else{
        fac(n - 1, new)
    }
}