// function dalam function gunanya agar function yang di buat hanya bisa di akses dalam file atau function tertentu
// misal membuat function welcome dan nama yang hanya bisa di akses oleh funtion main
fun main() {
    fun welcome(){ // ini hanya bisa di akses oleh main
        print("Selamat Datang ")
    }
    fun nama(name:String):String{ // ini hanya bisa di akses oleh main
        return name
    }
    welcome()
    println(nama("Aldi"))
    lagi()

    var number  = varlain ?:100
}

fun lagi(){ // ini bisa di akses siapapun
    tutup()
    //welcome() // tidak bisa mengakses fungsi dalam fungsi lain contohnya diatas yakni main
}

fun tutup() {
    println("Selamat tinggal")
}

