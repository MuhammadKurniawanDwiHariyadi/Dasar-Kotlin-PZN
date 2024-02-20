// single expresion function, dimana fungsi hanya berisi satu baris code / block code simple

fun pembuka (nama: String?=""): Unit = println("Selamat datang, Halo $nama")

fun bagi(a: Double, b: Double): Double = a/b // jadi tidak perlu menuliskan full dengan kurung kurawal

fun selesai() = println("Selesai, bye")

fun main() {
    pembuka()

    bagi(20, 15)

    selesai()
}
