fun main() {
//     data yang berurutan (range)
//    1-100 == 1..10 (Ascending)
    val range = 1..10

    println(range)
    println(range.step)


//    operasi range
//    count (total data)
//    constains(value) mengecek apakah ada value
//    first (nilai pertama)
//    last (nilai akhir)
//    step (nilai kenaikanya)

//    range kebalik, jadi dimulai dari yang terbesar ke terkecil (Descending) \
    val range2 = 20 downTo 1

    println(range2.count())
    println(range2.first)
    println(range2.last)
    println(range2.step)
    println(range2.contains(11))
    println(range2.contains(22))

//    mengatur stepnya
    val range3 = 1..20 step 2
    println(range3.count())

}