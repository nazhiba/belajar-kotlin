fun main() {
    val integer = 100 //32bit
    val maxint = Int.MAX_VALUE
    val minint = Int.MIN_VALUE
    print("$maxint dan $minint")

    val longnumber:Long = 100 //64bit

    val longnumber2 = 100L //64bit

    val shortsnumber:Short = 10 //16bit
    val shortToInt: Int = shortsnumber.toInt() //64bit

    val bytenumber = 0b11010010 //8bit

    val doubleNumber = 1.4 //64bit

    val floatNumber: Float = 0.3990417f //32bit
    val UntukAngkaRibuan = 100_000_000
    println(UntukAngkaRibuan)
    
    val stringnumber = "23"
    val lima = 5
    val string_to_number = stringnumber.toInt()
    val results = string_to_number + lima
    println("  "+results)
}