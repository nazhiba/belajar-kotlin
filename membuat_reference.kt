var message = "Kotlin"


fun main() {
    println(::message.name)
    println(::message.get())
    :: message.set("Kotlin academy")
    println(::message.get())
    val sum:(Int, Int) -> Int = ::count
    val numbers = 1.rangeTo(10)
    val evenumber = numbers.filter  (::isevenumber)
    println(evenumber)
    val _evenumber = numbers.filter ( Int::X)
    println(_evenumber)
}
fun count(valueS: Int, valueB: Int): Int {
    return valueS + valueB
}
fun isevenumber(number: Int) = number % 2 == 0
fun Int.X() = this % 2 == 0


