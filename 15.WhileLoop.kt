fun main() {
    var i = 1

    while (i<=5){
        println("ini perulangan ke $i")
        i++ // while gk bisa ascedning otomatis jadi manual untuk mencegah infinite loop
    }

    println("----------------------")

    var ulang = true
    var angka = 1
    while(ulang){
        if (angka == 3){
            ulang = false
        } else {
            println("ini angka ke $angka")
            angka++
        }
    }

    println("----------------------")


}