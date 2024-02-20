fun main() {
//    sama dengan switch
//    when sederhana dan sangat ekspresif
    val UAS = "C"
    when (UAS){
        "A" -> println("Nilai anda A")
        "B" -> println("Nilai anda B")
        "C" -> println("Nilai anda C")
        "D" -> println("Nilai anda D")
        else -> println("Nilai anda kurang")

    }

    when (UAS) {
        "10", "9", "8" -> println("Lulus")
        else -> println("Jumpa lagi tahun depan")
    }

    val nilai_akhir = 'B'
    val deskripsi_nilai = arrayOf('A', 'B')

    when (nilai_akhir){
        in deskripsi_nilai -> println("Anda Lulus")
        !in deskripsi_nilai -> println("Anda ngulang")

    }

//    pengecekan tipe data
    val nama = "aldi"
    when (nama) {
        is String -> println("ini $nama")
        !is String -> println("ini bukan teks string")
            }

//    perbandingan
    val UTS = 100
    when {
        UTS > 80 -> println("Nilai anda A")
        UTS > 60 -> println("Nilai anda B")
        UTS > 40 -> println("Nilai anda C")
        UTS > 20 -> println("Nilai anda D")
        UTS > 0 -> println("Nilai anda E")
        else -> println("Nilai anda belum terdaftar")

    }
}
