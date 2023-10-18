fun main() {
    val teks = "hello bang jago"
    val jawab = teks.also {
        println("value lenght -> ${it.length}")
    }

    println(jawab)


    val  message: String? = null

    message?.let{
        val length = it.length * 2
        val text = "text lenght $length"
        println(text)


    } ?: run {
        val text = "message is null"
        println(text)
    }


}