fun main() {
    val text = "hello"
    val result = text.run{
        val from = this
        val to = this.replace("hello", "kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")

    val message = "hello kotlin"
    val jawaban = with(message){
        println("value is $this")
        println("with lenght ${this.length}")
    }

    val jawaban2 = with(message){
        "Kata pertama adalah ini ${this[0]}"+
                "dan akhir karakter adalah ini ${this[this.length - 1]}"
    }

    println(jawaban2)

    val builder = StringBuilder().apply {
        append("hello bang ")
        append("Kotlin")
    }
    println(builder.toString())
}


//with