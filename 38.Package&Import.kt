// package tempat yang digunakan untuk mengorganisir file code, nama lain folder
// package dengan huruf kecil semua dan titik untuk tiap pakage / sub package

// file bisa mengakses dalam package yang sama
// kalau beda ackage bisa menggunakan Import

import com.perusahaan.projeknya.spesialpackage.halo
import com.perusahaan.projeknya.database.*


fun main() {
    halo("Aldi") // ini pake import
    com.perusahaan.projeknya.spesialpackage.selamatTinggal("Aldi") // ini manual import

    // kalau semua data/funct mau digunakan bisa menggunakan bintang(*) pada bagian akhir import
    data1()
    data2()
    data3()
    data4()
    data5()
    data6()

}