fun main() {
//    mengabungkan dua buah boolean
//    && == dan
//    || == atau
//    ! kebalikan

//    pada logika engginer
//    true dan true == true
//    true dan false == false
//    false dan true == false
//    false dan false == false

//    true atau true == true
//    false atau true == true
//    true atau false == true
//    false atau false == false

//    !true == false
//    !false == true

    val uas = 80
    val uts = 80
    val absen = 50

    val lulus_uas = uas > 75
    val lulus_uts = uts >= 80
    val lulus_absen = absen >= 80

//    println(lulus_uas && lulus_uts)
    println(lulus_uas && lulus_uts || lulus_absen)


}
