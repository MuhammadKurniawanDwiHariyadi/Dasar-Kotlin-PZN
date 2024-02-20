// tersering khusus operasi matematika dengan 2 data
// syaratnya harus dijadikan extentionFunction, harus 1 parameter, tidak boleh varargs juga tidak boleh default/null
// bentuknya sama seperti extention cuma ada parameternya
infix fun String.to(parameternya: String): String {
    if (parameternya == "UP"){
        return this.toUpperCase()
    } else if (parameternya == "DOWN") {
        return this.toLowerCase()
    }else {
        return this
    }
}

infix fun String.ke(parameternya: String): String {
    if (parameternya == "UP"){
        return this.toUpperCase()
    } else if (parameternya == "DOWN") {
        return this.toLowerCase()
    }else {
        return this
    }
}


fun main() {
    val hasil = "Aldi" to "UP"
    val hasil2 = "ORANG" ke "DOWN" // jadi "ORANG" sebagai data langsung dari fungsi, "ke" sebagai nama fungsinya, "DOWN" sebagai parameternya
    val hasil3 = "Bojonegoro"

    println("$hasil $hasil2 $hasil3")

    //contoh nyatanya infix seperti
    // 100 downTo 1
    // itu dari infix
}