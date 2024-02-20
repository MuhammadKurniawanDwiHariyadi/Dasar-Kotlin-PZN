// kemampuan fungsi/lambda/anonymous berinteraksi dengan data di sekitarnya di dalam scope yang sama
// pada umunya di hindari karena dapat merubah data orang lain
var hitungan = 0
fun main() {

    val lambda: () -> Unit = {
        println("Lambda Increment")
        hitungan++
    }

    val anonymous = fun() {
        println("Anonymous Increment")
        hitungan++
    }

    fun fungsi(){
        println("Fungsi Increment")
        hitungan++
    }

    // semua fungsi" tsb masuk dalam scope main jadi bisa merubah data dalam variabel hitungan, ini yang harus di waspadai
    lambda()
    anonymous()
    fungsi()
    lambda()
    anonymous()
    fungsi()

    println(hitungan) // akan berubah menyesuaikan dengan berapa kali fungsi" tsb di panggil jadi ngga ngulang lagi ke satu

}
