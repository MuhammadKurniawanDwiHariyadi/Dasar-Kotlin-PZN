fun main() {
//    data array
    val array = arrayOf("Muhammad", "Kurniawan", "Dwi", "Hariyadi")

    for (nama in array) {
        println(nama)
    }

    println("\n")

    for (value in 1..10){
        println("nilai $value")
    }

    for (value in 100 downTo 0 step 20){
        println("nilai $value")
    }

    val panjangArray = array.size - 1
    for (value in 0..panjangArray){
        println("index ke $value = ${array.get(value)}")
    }

    println("----------------------")

// ada break dan countinue juga
    for (value in 0..panjangArray){
//        when{
//            value % 2 == 0 -> println("index ke $value = ${array.get(value)}")
//            else -> continue
//        } //kurang coocok when disini
        if (value % 2 == 0){
            println("index ke $value = ${array.get(value)}")
        } else {
            continue // bakal skip index ganjil
        }
    }

    println("----------------------")
    for (value in 0..panjangArray){
        if (value == 3){
            break // bakal berhenti ketika index mencapai 3
        } else{
            println("index ke $value = ${array.get(value)}")
        }
    }
}