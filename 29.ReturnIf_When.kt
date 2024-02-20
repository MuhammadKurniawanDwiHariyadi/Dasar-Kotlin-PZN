fun main() {
    // ini untuk yang if
    fun tampil(nama:String? = ""): String{
        return if (nama == ""){
            "Halo Bang"
        }else {
            "Halo Bang $nama"
        }
    }

    println(tampil())
    println(tampil("Aldi"))

    // ini untuk yang when
    fun tampil2(nilai:Int = 0):String{
        return when{
            nilai > 90  -> "Nilai A"
            nilai > 80 -> "Nilai B"
            nilai > 70 -> "Nilai C"
            nilai > 60 -> "Nilai D"
            nilai > 50 -> "Nilai E"
            nilai > 40 -> "Nilai F"
            nilai > 30 -> "Nilai G"
            nilai > 20 -> "Nilai H"
            nilai > 10 -> "Nilai I"
            else -> "Nilai jelek"
        }
    }

    println(tampil2())
    println(tampil2(100))
}