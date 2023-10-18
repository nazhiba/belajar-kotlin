fun main() {
    val spasi = "==========================="

    var ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }

    println(spasi)
    val rangeint = 1..10
    println(rangeint.step)

    println(spasi)
    val _rangeint = 1..10 step 2
    _rangeint.forEach{
        println("$it")
    }
    println(_rangeint.step)

    println(spasi)
    val rangeInt = 1.rangeTo(10)
    val downint = 10.downTo(1)

    if (7 in downint){
        println("value 7 is in downint")
    }
    println(spasi)

    if(11 !in downint){
        println("no value 11 in range")
    }
    println(spasi)
    val rangechar = 'A'.rangeTo('F')
    println(rangechar)


}