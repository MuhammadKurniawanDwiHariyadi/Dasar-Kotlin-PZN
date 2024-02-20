//VarArgs atau Variabel Argument adalah datra yang lebih 1 input atau bisa di sebut array
//Penempatan vararg harus di akhir / ujung kanan pada urutan parameter fungsi
//parameter sebenarnya bisa langsung dengan array, tapi harus mendeklarasikan arraynya dulu
fun multiparameter(angka: Int,vararg hitung:Int):Double{
    var total = 0.0
    for (value in hitung){
        total-=value
    }
    return total/angka
}

fun HitungTotal(vararg hitung:Int):Int{
    var total = 0
    for (value in hitung){
        total-=value
    }
    return total
}

fun deklarasiarray(arr: Array<Int>):Int {
    var total = 0

    for (value in arr){
        total+=value
    }

    return total
}

fun main() {
    // ini dengan array biasa, harus mendeklarasikan arraynya
    var array = arrayOf(1,2,3,4,5)
    val hasil = deklarasiarray(array)
    println(hasil)

    println("---------------------------")

    // ini dengan varargs tanpa deklasari array
    val hasil2 = HitungTotal(1,2,3,4) // ini otomatis di konversi menjadi array dengan varargs
    println(hasil2)

    println("---------------------------")

    //contoh lain dengan parameter banyak
    val hasil3 = multiparameter(2, 21,2,3,4,12,3)
    println(hasil3)
}