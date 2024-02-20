fun main() {
//     array itu kumpulan data tapi di kotlin hanya cuma bisa tipe data yang sama (jika ada diamond nya)
    val nama: Array<String> = arrayOf("Muhammad", "Kurniawan", "Dwi", "Hariyadi")
//    <> diamond operation
    println(nama[0])

//    beberapa operasi array
//    val.size (mendapatkan panjang array)
//    val.get(index) (mengambil data array)
//    val[index] (mengambil data array)
//    val.set(index, value) (mengubah data dalam indeks tersebut)
//    val[index] = value (mengubah data dalam indeks tersebut)

    nama.set(0, "Aldi")//val bisa merubah data array
    // atau
    nama[0] = "Aldi"//val bisa merubah data array
//    nama = arrayOf("aldi", "disini")//val tidak bisa mendeklarasikan ulang variabel



//    nilai null dalam array seperti biasa pakai ?
    val member: Array<String?> = arrayOfNulls(5)
    member[0] = "Alim"
    member[2] = "Aldi"
    member[4] = "Akmal"


    println("----------------------------")
    println(member[0])
    println(member.contentToString())
    println(member.size)
    println("----------------------------")

    val ketum: Array<String?> = arrayOf(null, "Kak Agung", "Kak Ilham", null)
    ketum[0] = "Kak Dito"

    println(ketum[0])
    println(ketum.size)

    println("----------------------------")
    val litbang2023 = arrayOf("Aldi", "Wahyu", "Alvian", "Risaldi", "Devi", "Adel", 1, 2, 3)
    println(litbang2023[1])
    println("----------------------------")

}