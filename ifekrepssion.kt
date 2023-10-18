fun main() {
    val umur = 62
    //usia lanjut berkisar anatara 60 sampai 74 Tahun
    //usia lanjut tua berkisar antara 75 sampai 90 Tahun
    //usia sangat tau adalah 90 Tahun ke atas
    
    if (60 >= umur && umur <= 74){
        println("umurnya berada di usia lanjut")

    }else if (75 >= umur && umur <= 90) {
        println("Umurnya berada di usia lanjut tua")

    }else if (90 < umur){
        println("Umurnya berada di usia sangat tua")

    }else {
        println("Umur harus berupa Integer atau ada yang eror")
    }
}
