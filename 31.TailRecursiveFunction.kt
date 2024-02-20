// recursive fungsi kadang error stack overflow
// ketika banyak fungsi yang di panggil sampai ujung fungsi selesai
// yang mana fungsi pertama akan menunggu sampai fungsi akhir
// yang akan menghasilkan output yang banyak (hanya jika setiap memanggil ada outputnya, beda dengan output hasil di akhir)
// tumpukan pemanggilan terlalu banyak!!
// solusinya di kotlin dengan tailed recursive fungsi, dimana fungsi di compile berbentuk loop biasa dengan code recursive fungsi pada umumnya
fun main() {
//    var value = 1
//    tailrec fun muncul(angka: Int):Int{
//        value *= angka
//        return if (angka==1){
//            return value
//        }else {
//            muncul(angka-1) // pemanggilan diri sendiri hanya boleh seperti ini tanpa embel" lain
//        }
//    }
//
//    println(muncul(3))

    // error ini
//    fun munculSalah(angka: Int): Unit{
//        println("Rekursive ke $angka")
//        if (angka>0){
//            munculSalah(angka-1) // pemanggilan diri sendiri hanya boleh seperti ini tanpa embel" lain
//        }
//    }
//
//    munculSalah(10000)


    //ini benar
    tailrec fun munculBenar(angka: Int): Unit{
        println("Rekursive ke $angka")
        if (angka>0){
            munculBenar(angka-1) // pemanggilan diri sendiri hanya boleh seperti ini tanpa embel" lain
        }
    }

//    munculBenar(10000)

    // karena tidak bisa di kasih embel-embel/math lain ketika memanggil fungsi sendiri maka bisa seperti ini
    tailrec fun FaktorialTail(angka:Int, hasil: Int=1): Int {
        return when (angka){
            1 -> hasil
            else -> FaktorialTail(angka - 1, hasil * angka) // yang biasanya total * namaFungsi(parameter) itu tidak boleh, harus namaFungsi(parameter), jadi triknya dengan dimaskukan ke parameter
            // nanti output alurnya seperti ini
//            FaktorialTail(3,1) (1 dari defaultnya)
//            FaktorialTail(2,3) (3 dari perkalian sebelumnya)
//            FaktorialTail(1,6) (6 dari perkalian sebelumnya)
        }
    }

    println(FaktorialTail(3))
}