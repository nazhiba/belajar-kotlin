fun main() {
    val info = presiden_indonesia("Joko widodo", 62)
    println(info)

    printInfo("lemoot")
}

fun presiden_indonesia(nama :String, age: Int) = "Presiden pada tanggal 28 September 2023 adalah $nama degan umur $age"

fun printInfo(name :String) {
    println("Nama Kamu adalah $name")
}