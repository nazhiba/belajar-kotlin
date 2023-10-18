fun main() {
    val string = "Menurut Badan Pusat Statistik, hingga tahun 2021, pemerintah mencatat penambahan jumlah pulau di Indonesia menjadi 17.000"
    val firstChar = string[0]
    //mencetak kata pertama
    println("kata pertama adalah $firstChar")


    val text = "Kotlin"
    for (char in text){
        println("$char")
    }

    val statement = "Kotlin itu sulit \"bercanda\""
    println(statement)

    val nama_presiden = """
        
        Soekarno
        Soeharto
        BJ Habibie
        Abdurrahman Wahid(Gus Dur)
        Megawati Soekarnoputri
        Susilo Bambang Yudhoyono(SBY)
        Joko Widodo(Jokowi)
        
    """.trimIndent()
    println(nama_presiden)

}