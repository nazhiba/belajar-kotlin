/*
Function Type
Pada sub-modul selanjutnya, kita akan belajar tentang lambda dan higher-order function,
namun sebelum itu kita perlu tahu terlebih dahulu apa itu function type.
Seperti namanya, Anda dapat membuat sebuah fungsi menjadi tipe data. Menarik kan?

Kotlin sendiri menggunakan function type untuk tipe deklarasi yang berhubungan dengan sebuah fungsi.
Dalam penggunaannya, terdapat beberapa tanda yang berhubungan dengan sebuah fungsi seperti jumlah dan tipe parameter serta tipe kembalian.

Setiap function type memiliki tanda kurung .
Di dalamnya terdapat sebuah parameter dan jumlah tipe yang menandakan jumlah parameter dari fungsi tersebut.
Pada contoh di atas, fungsi tersebut memiliki 2 (dua) parameter dengan tipe Int dan memiliki tipe kembalian String.
Ketika kita tidak ingin fungsi tersebut mengembalikan nilai, kita bisa menggunakan Unit. Berbeda dengan fungsi pada umumnya, jika menggunakan tipe kembalian Unit
, kita tidak wajib menuliskannya.

Ketika kita mempunyai beberapa fungsi yang memiliki function type yang sama,
kita bisa menyederhanakannya. Bagaimana caranya? Manfaatkan kata kunci typealias untuk memberikan nama
alternatif dari sebuah function type seperti berikut:


 */



fun main() {
    val sum: Arithmatic = {valueA, valueB -> valueA + valueB}
    println(sum?.invoke(10,10))
    val multiply: Arithmatic = {valueA, valueB -> valueA * valueB}
    println(multiply?.invoke(20,20))


}


typealias Arithmatic = (Int,Int) -> Int

