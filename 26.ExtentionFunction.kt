// membuat fungsi yang beda
fun String.nama(): String {
    return this
}

fun String.Opening() : Unit = println("halo " + this)

fun String.Closing() = println("selamat tinggal $this")

fun main() {
    val lengkap: String = "Muhammad Kurniawan Dwi Hariaydi"
    val pendek = "Aldi"

    pendek.Opening()
    println(lengkap.nama())
    println("Lila Aulia Zahra".nama())
    pendek.Closing()

}
