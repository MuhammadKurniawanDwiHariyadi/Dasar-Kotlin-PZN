// fungsi yang memanggil fungsinya sendiri
// scontoh disini menggunakan faktorial

fun main() {
    // cara ribet
    var total: Int = 1
    fun hitung(angka: Int = 1): Int{
         return if (angka > 1){
             total *= angka
             hitung(angka-1)
        } else {
            total
        }
    }
    println(hitung(5))

    println("--------------")

    // cara simple
    fun hitung2(angka:Int = 0): Int{
        return when (angka){
            1 -> 1
            else -> angka * hitung2(angka-1)
        }
    }

    println(hitung2(5))
}