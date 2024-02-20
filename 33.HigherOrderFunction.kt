// function yang mana parameternya merupakan lambda
fun halo (nama: String, pindah: (String)->String):String {
    return "Haloo ${pindah(nama)}"
}
// pindah: (String)->String ini merupakan parameter kedua dan merupakan lambda

fun main() {
    val besar: (String) -> String = {data: String -> data.toUpperCase()} // bisa gini
    val kecil = {data: String -> data.toLowerCase()} // atau ngga perlu juga ngg apa"

    println(halo("AldI",besar))
    println(halo("AlDi",kecil))
    println(halo("AlDi",{data:String -> data.toLowerCase()}))


    // Trailing Lambda lebih enak di pake
    val hasil1 = halo("Aldi") { data:String ->
        data.toUpperCase()
    }

    println(hasil1)
}