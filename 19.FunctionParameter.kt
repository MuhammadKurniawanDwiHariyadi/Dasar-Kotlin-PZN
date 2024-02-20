fun main() {
    val a: Int = 10
    val b: Int = 12

    pembuka(a, b)

    val c = tambah(a, b)
    println("jika di tambahkan $c")
    val d = kurang(a, b)
    println("jika di kurangkan $d")
    // tanpa return value
    kali(a, b)
    bagi(a, b)

    penutup()

    println("------------------------------")
    tampil_nama("Aldi", null)
    tampil_nama("Kurniawan", "Dwi")
}

fun tampil_nama(NamaDepan: String, NamaBelakang: String?) {
    if (NamaBelakang == null ){
        println("pembuat $NamaDepan")
    } else {
        println("pembuat $NamaDepan $NamaBelakang")
    }
}

fun penutup() {
    println("Terimakasih")
}

fun pembuka(a: Int, b:Int) {
    println("Selamat Datang di aritmatika sederhana")
    println("nilai yang ada yakni $a dan $b")
}

fun bagi(a: Int, b: Int){
    println("jika di bagi "+ a.toFloat()/b.toFloat())
}

fun kali(a: Int, b: Int) {
    println("jika di kalikan "+ a*b)
}

fun kurang(a: Int, b: Int): Int {
    return a-b
}

fun tambah(a: Int, b: Int): Int {
    val c = a + b
    return c
}

