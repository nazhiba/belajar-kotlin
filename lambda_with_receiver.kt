//import java.lang.StringBuilder
//import kotlin.text.StringBuilder

fun main() {
    val message = builderstring {
        append("Hello ")
        append("from ")
        append("lambda")
    }

    println(message)
}

fun builderstring(action: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}