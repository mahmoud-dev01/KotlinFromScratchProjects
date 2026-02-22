fun main() {
    val x = 10
    if (x > 0) println("x is positive") else println("x is negative")

    val y = -10
    if (x > 0) {
        println("y is positive")
    } else {
        println("y is negative")
    }

    val a = 100
    val b = -30
    var max: Int = 0
    if (a > b) {
        max = a
        println("a is greater than b.")
        println("max of $a and b is: $max")
    } else if (a < b) {
        max = b
        println("b is greater than a.")
        println("max of $a and b is: $max")
    } else {
        println("a and b have the same value: $a")
    }
    println(max)
}