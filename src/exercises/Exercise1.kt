package exercises

fun main() {

    println("Enter your age:")
    val age: Int = readln().toInt()
    if (age < 18) {
        println("You are not eligible to vote yet.")
    } else if (age >= 18 && age <= 120) {
        println("You are eligible to vote.")
    } else {
        println("Please enter a valid age.")
    }

    println("Enter your age:")
    when(readln().toInt()) {
        in 0 .. 17 -> println("You are not eligible to vote yet.")
        in 18 .. 120 -> println("You are eligible to vote.")
        else -> println("Please enter a valid age.")
    }
}