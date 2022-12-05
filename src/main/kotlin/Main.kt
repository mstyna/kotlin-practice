import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("********** Start of TypeConversion *********")
    // Conversion to Double, Long and Char
    val num: Int = 125
    val d: Double = 12.5
    val l: Long = 15
    val floatNumber = 10f
    val doubleNumber = 1.0

    val square: Double = sqrt(num.toDouble())
    val long: Long = num.toLong()
    val char: Char = num.toChar()
    val charCode: Int = char.code
    val dl: Long = d.toLong()
    val di: Int = d.toInt()
    val li: Int =  l.toInt()

    // Conversion to Short and Byte types

    val shortNumber = floatNumber.toInt().toShort()
    val byteNumber = doubleNumber.toInt().toByte()

    // Conversion to String
    val n = 8     // Int
    val dbl = 10.09 // Double
    val c = '@'   // Char
    val b = true  // Boolean

    val s1 = n.toString() // "8"
    val s2 = dbl.toString() // "10.09"
    val s3 = c.toString() // "@"
    val s4 = b.toString() // "true"

    val si = "8".toInt() // Int
    val sd = "10.09".toDouble() // Double
    val sb = "true".toBoolean() // Boolean

    println("Actual Number : $num")

    println("*** Conversion to double, long and char ***")
    println("Converted int to double: Double -> $square")
    println("Converted int to long: Long -> $long")
    println("Converted int to char: Char -> $char")
    println("Converted char [}] to char: Int = char.code -> $charCode")
    println("Converted double(12.5) to Long -> $dl")
    println("Converted double(12.5) to Int -> $di")
    println("Converted long(15) to Int -> $di")

    println("*** Conversion to Short and Byte types ***")
    println("Converted float (10f) to Short -> $shortNumber")
    println("Converted double (1.0) to byte -> $byteNumber")

    println("*** Conversion to String ***")
    println("Converted Int to String -> $s1")
    println("Converted double to String -> $s2")
    println("Converted char to String -> $s3")
    println("Converted boolean to String -> $s4")
    println("Converted String to Int -> $si")
    println("Converted String to double -> $sd")
    println("Converted String to Boolean -> $sb")

    println("********** End of TypeConversion *********")


}