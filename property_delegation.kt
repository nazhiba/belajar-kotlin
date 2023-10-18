import java.beans.BeanProperty
import kotlin.reflect.KProperty

fun main() {
    val PP = aA()
    val X = P()
    val Y = H()

    PP.name = "nadzib"
    X.name = "gatotkoaca"
    Y.name = "miya"

    println("Nama Orang :${PP.name}")
    println("Nama Cerita Rakyat:${X.name}")
    println("Nama Hero:${Y.name}")


    val animal = anim()
    animal.name = "Nadzib"
    animal.weight = 173.0
    animal.age = 19
    println("nama : ${animal.name}")
    println("tinggi : ${animal.weight}")
    println("umur : ${animal.age}")

}

class de{
    private var v:Any = "default"
    operator fun getValue(classRef: Any,property: KProperty<*>):Any{
        println("Fungsi ini sama seperti getter untuk properti ${property.name} padaa class $classRef")
        return v
    }
    operator fun setValue(classRef: Any, property: KProperty<*>, newV: Any){
        println("NIlai ${property.name} dari : $v akan berubah  menjadi $newV")
        v = newV
    }

}

class d{
    private var v:String = "Default"
    operator fun getValue(classRef: Any?, property: KProperty<*>):String{
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return v
    }
    operator fun setValue(classRef: Any?,property: KProperty<*>,newV:String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class ${newV}")
        println("Nilai ${property.name} dari: $v akan berubah menjadi $newV")
        v = newV
    }
}

class anim{
    var name: Any by de()
    var weight:Any by de()
    var age:Any by de()
}


class aA {
    var name: String by d()
}

class P {
    var name: String by d()
}

class H {
    var name: String by d()
}


