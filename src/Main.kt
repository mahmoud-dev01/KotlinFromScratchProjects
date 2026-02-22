fun main() {

    val a = 20
    val b = 7
    val sum = a + b
    val difference = a - b
    val product = a * b


    val quotientFloat = 20.toFloat() / 7 // 2.8
    val quotientInt = 20 / 7 // 2
    println(quotientFloat)
    println(quotientInt)
    val result = 20 % 7
    /* not -> 2.8
    * 2
    * 2
    * 2
    * 2
    * 2
    * 2
    * 2
    * */
    println(result) // 6
    val resultRev = 7 % 20
    println(7 / 20) // 0
    println(resultRev) // 7
}