data class DataUser(val nama:String,val nomor:Int)
data class databackup(val nama_bckup:String,val nomor_bckup: Int)

data class dataBSI(val username: String, val kode: Int){
    fun intro(){
        println("nasabah dengan username : $username dengan kode : $kode")
    }
}
fun main() {
    val spasi = "==========================="
    val datauser = DataUser("roman",12)
    val nama = datauser.component1()
    val nomor = datauser.component2()

    println("User baru dengan nama $nama nomor antrian $nomor")

    println(spasi)
    val data_user = databackup("$nama", nomor)
    val (nama_bckup,nomor_bckup) = data_user
    println("nama : $nama_bckup \nnomor : $nomor_bckup")

    println(spasi)
    val data_nasabah = dataBSI("Riyanto khanedi",202002193)
    data_nasabah.intro()
}

