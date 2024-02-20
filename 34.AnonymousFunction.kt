// karena lambda tidak bisa mendeklarasikan return dan line terakhir bakar jadi return nya maka di perlukan anonimous
fun main() {
    fun halo (nama: String, pindah: (String)->String):String {
        return "Haloo ${pindah(nama)}"
    }


    val anonymous= fun(parameter: String): String {
        if (parameter.isBlank()){
            return "Brooo"
        }else {
            return parameter.toUpperCase()
        }
    }

    println(halo("Aldi", anonymous))
    println(halo("", anonymous))
    println(halo("Hariyadi",fun(nama:String):String{
        return nama.toUpperCase()
    }))
}