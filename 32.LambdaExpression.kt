// fungsi tanpa nama
fun keBesar(data:String): String = data.toUpperCase()

fun main() {
    // ----------------------sebagai variabel----------------------
    val Lambda2Var:(String, String?) -> String = { nama:String, panjang:String? ->
        val hasil = "nama pendek $nama dan panjang $panjang"
        hasil
    }
    // variabel : (tipeParameter) -> tipeReturnValue = { variabelParameter:opsionalTipeParameter ->
        // variabelParameter blablabla
    // }
    // baris terakhir (diatas yakni "variabelParameter blablabla") akan otomatis menjadi return value nya


    println(Lambda2Var("aldi", "Muhammad Kurniawan Dwi Hariyadi"))

    println("-----------------------------------------------")

    // ----------------------jika parameternya satu juga bisa kita gunakan it tanpa deklarasi variabelParameter lagi----------------------
    val LambdaTanpaVarParam: (String) -> String = {
        val hasil = "$it nama saya"
        hasil
    }

    println(LambdaTanpaVarParam("Aldi"))

    println("-----------------------------------------------")

    // ----------------------Method/Function Reference----------------------
    // membuat lambda dari fungsi yang sudah ada
    val rubah: (String) -> String = ::keBesar

    val hasil = rubah("aldi bojonegoro")
    println(hasil)
}