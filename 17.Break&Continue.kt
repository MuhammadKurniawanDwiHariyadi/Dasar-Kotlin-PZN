fun main() {
    var angka = 1
    while(true){
        println("ini kata ulang")
        angka++
        if (angka==5){
            break
        }
    }

    println("----------------------")

    angka = 1
    for(value in angka..50){
        if (value == 5){
            continue
        }
        println("ini kata ulang ke $value")

        if (value == 10){
            break
        }
    }

    println("----------------------")

    angka = 0

    while (true) {
        angka++

        if (angka == 5) {
            continue
        }
        
        println("Nilai angka: $angka")

        if (angka >= 10) {
            break
        }
    }
}