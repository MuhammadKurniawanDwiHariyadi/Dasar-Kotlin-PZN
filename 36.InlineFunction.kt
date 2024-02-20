// Higher Order Function yang mana memnagiil lambda yang berulang bakal menurunkan performanya
// maka digunakanlah Inline Function yang bakal merubah Higher Order Function
// fungsinya menduplikat Higher Order Function - mirip tailRecursive
// kegunaaanya ketika misal ada loop beratus" kali

inline fun halo(name: () -> String): String { // Inline
    return "Halo ${name()}"
}

fun halo2(name: () -> String): String { // Lambda Biasa
    return "Halo ${name()}"
}

// karena inline akan mmebuat seluruh parameter lambda menjadi inline maka di perlukan no inline untuk menjadikanya no inline pada depan paramater
inline fun halo3(
    name: () -> String, // paramater lambda inline
    noinline asal: () -> String // paramater lambda no inline
): String {
        return "Halo ${name()} asal dari ${asal()}"
    }

fun main() {
    println(halo { "Aldi" })
    println(halo2 { "Aldi" })

//    ketika di decompile menjadi java bakal kelihatan bahwa lambda biasa akan membuat fungsi terus tiap perulangan yang mana akan memangkas performa dan code java lebih pendek
//    tapi jika menggunakan inline maka akan jauh lebih cepat karena code java nya hanya di duplikat tanpa membuat fungsi baru setiap di panggil, tapi code java nya panjang

//    for (i in 1.. 100){
//        println(halo { "Aldi ke $i" }) // ini baru cocok digunakan inline function
//    }

    println(halo3({ "Aldi" },{ "Bojonegoro" }))
}