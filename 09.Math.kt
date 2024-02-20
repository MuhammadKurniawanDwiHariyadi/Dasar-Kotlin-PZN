fun main() {
    val hasil: Int = 10/3
    println(hasil)

    val hasil2 = 10.0/3.0
    println(hasil2)

    val hasil3 = 10 + 10 / 2
    println(hasil3)

    val hasil4 = 10 % 3
    println(hasil4)

//    Augmented Assigment
    var total= 0

    val a = 2
    val b = 3
    val c = 4

    total += a
    total += b
    total += c

//    tanpa harus total = total + a, total = total + b, dst..

    println(total)

//    Unary Operator
//    stepnya berapa

    total++//total + 1
    total++
    println(total)

    total--//total - 1
    println(total)

    val celcius = -10
    println(celcius)

    val kenyang = true
    println("kenyang = ${!kenyang}")
}
