fun main() {
    println(buildstring)
    val text = "Hello"
    text.let{value ->
        val message = "$value kotlin"
        println(message)
    }
}

val buildstring = StringBuilder().apply {
    append("Hello ")
    append("World ")
}

