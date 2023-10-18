import java.lang.Exception
import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {
    val S:String? = null
    lateinit var s :String
    //try-catch
    try {
        s = S!!
        println(s)
    } catch (e:Exception){
        s = "try-catch String value is Null"
        println(s)

    }

    // try catch finally
    val SS:String? = null
    lateinit var ss:String
    try {
        ss = SS!!
    } catch (e:Exception){
        ss = "try catch finally String value is null"
    }finally {
        println(ss)
    }
    //multiple exception
    val sSv:String? = "12"
    var soome:Int = 0
    try {
        soome = sSv!!.toInt()
    }catch (e:NullPointerException){
        soome = 0
    }catch (e:NumberFormatException){
        soome = -1
    }finally {
        when(soome){
            0 -> println("Catch block NullPointerException terpanggil")
            -1 -> println("Catch block NumberFormatException terpanggil")
            else -> println(soome)
        }
    }

}

