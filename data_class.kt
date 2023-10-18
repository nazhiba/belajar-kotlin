class User(val name: String, val age: Int)

data class datauser(val name: String, val age: Int)

class Admin(val name: String,val age: Int){
    override fun toString(): String {
        return "Admin(name=$name,age = $age)"
    }
}


fun main() {
    val spasi = "==========================="

    val user = User("nazhiif",19)
    val Datauser = datauser("nazhiif", 19)
    println(user)
    println(Datauser)
    println(spasi)
    val admin = Admin("aku", 20)
    println(admin)
    println(spasi)
    val datauser1 = datauser("rahamt",18)
    val datauser2 = datauser("labon",90)
    val datauser3 = datauser("labon",90)
    println(datauser1.equals(datauser2))
    println(datauser2.equals(datauser3))


}