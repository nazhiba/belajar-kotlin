//fun main() {
//    val spasi = "=================================="
//    val fulname = getFullname(first = "Kotlin", middle = "is", last = "awesome")
//    println(fulname)
//    println(spasi)
//    val name = name(first = "java")
//    println(name)
//    println(spasi)
//    val number = subnumer(10,10,10,40)
//    println(number)
//    println(spasi)
//    10.printInt()
//    println(spasi)
//    println(10.plusthree())
//
//}
//
//fun getFullname(first: String, middle: String, last:String):String{
//    return "$first $middle $last"
//}
//
//fun name(
//    first: String = "Kotlin",
//    middle: String = "is",
//    last: String = "easy") : String {
//    return "$first $middle $last"
//}
//
//fun subnumer(vararg number: Int):Int{
//    return number.sum()
//}
//
//
//fun <T> aslist(vararg input:T):List<T> {
//    val result = ArrayList<T>()
//    for (item in input)
//        result.add(item)
//    return result
//}
//
//
//fun Int.printInt(){
//    println("output $this")
//}
//
//
//fun Int.plusthree(): Int{
//    return this + 3
//}