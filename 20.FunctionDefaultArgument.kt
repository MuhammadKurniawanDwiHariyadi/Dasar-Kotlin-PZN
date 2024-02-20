fun default1(nama:String, asal:String? = "Tidak disebutkan") {
    println("""
       nama saya = $nama
       asal saya = $asal
    """)
}

fun main() {
    default1("Aldi") // akan mengambil default parameter yang sudah ditentukan yakni Tidak disebutkan
    default1("Hariyadi", "Bojonegoro") // akan mengisi parameter dan menghiraukan default parameter
}


