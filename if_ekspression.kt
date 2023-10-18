fun main() {
    val openhours = 7
    val now = 5
    val office: String
    if (now > openhours){
        office = "office buka"
    } else{
        office = "office tutup"
    }

    println(office)
}