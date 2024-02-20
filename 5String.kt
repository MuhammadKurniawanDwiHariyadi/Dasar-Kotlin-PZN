fun main() {
    var firstname: String = "Muhamamd"
    var lastname: String = "Kurniawan Dwi Hariyadi"
    var fullname: String = "Muhammad Kurniawan Dwi Hariyadi"

    var address: String = """
        St. Pemuda,
        Al. Yakup,
        Number 8,
        RT 26,
        RW 03,
        Vlg. Campurejo, 
        Cty. Bojonegoro,
        Prov. East Java,
        Cont. Indonesian
"""

    println(firstname)
    println(lastname)
    println(lastname)
    println(fullname)
    println(address)
    println("")

//    kalau ingin mengahapus margin untuk yang petik 3 menggunakan trim margin.
    var addresstrim: String = """
        |St. Pemuda,
        |Al. Yakup,
        |Number 8,
        |RT 26,
        |RW 03,
        |Vlg. Campurejo, 
        |Cty. Bojonegoro,
        |Prov. East Java,
        -Cont. Indonesian
    """.trimMargin("-")
//    Default trim margin itu | kalau bagian () tidak ada isinya maka akan menyeleksi bagian defaulntnya
//    Kalau bagian ("-") maka akan menyeleksi bagian - saja

    println(addresstrim)

//    Jadi di trim itu ada banyak kegunaan dalam string sendiri, contohnya itu untuk menghapus margin ada juga menghapus spasi dll




//    Menggabungkan String
    println(firstname +" "+ lastname)//x
//    ini untuk yang biasa, di kotlin kita mendapatkan striung template yang lebih memudahkan
    println("$firstname $lastname")//v


//    dengan operasi lebih dari 1
    println("$fullname memiliki = ${fullname.length} karakter")

}