fun main() {
    massage()
    val lenght = printmasssage("Hello from zero to hero")
    print(10, sum)
    result(100){
        value ->
        value + value
    }
    


}


val comorate = object :Runnable{
    override fun run() {
        TODO("Not yet implemented")
    }
}

val comporater_lambda = Runnable {

}

val massage = { println("Hello world") }

val printmasssage = {m:String -> println(m.length) }


var sum : (Int) -> Int = {value -> value + value}


fun print(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println(result)
}


inline fun result(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println(result)
}



