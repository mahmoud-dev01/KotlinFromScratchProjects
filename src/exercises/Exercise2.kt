package exercises

fun main() {

    val n: Int = readln().toInt()
    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    val input: String = readln()
    var first: Int = 0
    var last: Int = input.length - 1
    var isMatch: Boolean = true

    while (first < last) {
        if (input[first] != input[last]) {
            println("Not a palindrome")
            isMatch = false
            break
        }
        last--
        first++
    }
    if (isMatch) {
        println("Palindrome")
    }
}