// sama seperti funtcion biasa, hanya dfengan Unit sebagai tipe data returnya
fun munculHalo(nama:String?=""):Unit { // sebenarnya semua yang tanpa value return itu bentuknya Unit tapi tidak wajib di tulis
    println("halo $nama")
}

fun main() {
    munculHalo("Aldi")
    munculHalo()
}
