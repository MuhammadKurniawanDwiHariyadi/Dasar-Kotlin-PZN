const val APPLICATION = "kotlin dasar"
const val VERSION = "0.0.1"

fun main() {
//    di kotlin terdapat 2 perbedaan tipe variabel
//    mutable / bisa di rubah = var
//    imutable / tidak bisa di rubah = val
    var nama: String = "Muhammmad"
    nama = "Kurniawan"

    val rumah = "Bojonegoro" // dikotlin sebenarnya tidak perlu menyebutkan tipe data secara ekpilsit karena dia akan lebih tahu apa tipe data yang cocok dari isinya
//    rumah = "Campurejo"

    println("nama = $nama \nasal = $rumah")

//    variabel harus di deklarasikan
//    var umur: Int = null

//    bisa tapi dengan paksaan yang tidak di sarankan
    var riwayat: String? = null
    // atau langsung tanpa nilai
    var riwayat2: String

    riwayat = "SD CAMPUREJO 2"
    println(riwayat)
    println(riwayat?.length)// harus pakai tanda tanya jika belum ada isinya atau null


//    adalagi yang tidak bisa di rubah / imutable = constant tapi ini memiliki fitur yang lebih dari val karena bersifat global
//    biasanya untuk constraint ditandai dengan tulisan capslock
//    constant ada di luar fungsi
    println("$APPLICATION $VERSION")



}