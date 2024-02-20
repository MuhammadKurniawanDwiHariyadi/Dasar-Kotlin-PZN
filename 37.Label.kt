// label adalah penanda
// penggunakan label dengan nama label dan diakhiri dengan @
// kegunaannya untuk break, continue dan return dimana bisa menentukan ke label mana ketiga hal itu dijalankan
fun LabelLoopContinue(){
    loop_yang_i@ for (i in 1..10){
        loop_yang_j@ for (j in 1..10){
            if (j == 5){
                //break// ini akan break/continue yang j bukan i
                // tapi jika dengan label @ tadi
                continue@loop_yang_i // ini bisa break/continue yang I jadi akan berhenti di I nya
                // akan lanjut ketika bilangan kedua mnecapai 5
            }
            println("$i * $j = ${i*j}") // kalau bisa outputnya di bawah countinue/break agar bisa berjalan sebagaiamana semestinya

        }
    }
}

fun LabelLoopBreak(){
    loop_yang_i@ for (i in 1..10){
        loop_yang_j@ for (j in 1..10){

            if (i==9){
                break@loop_yang_i
                // akan berhenti ketika bilangan pertama mencapai 9
            }

            println("$i * $j = ${i*j}") // kalau bisa outputnya di bawah countinue/break agar bisa berjalan sebagaiamana semestinya

        }
    }
}



fun main() {
    fun LabelReturn(name: String, operation:(String) -> Unit): Unit= operation(name)

    LabelReturn("") LabelReturn@{
//        println("Aldi")
        if (it == ""){
            return@LabelReturn
        }else {
            println("Aldi")
        }
    }
}