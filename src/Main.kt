fun main() {

    println("Enter some text:")
    val userInput = readln()
    println("You entered: $userInput")

    while (true) {
        println("Enter an integer:")
        val num = readln()
        try {
            val intValue = num.toInt()
            println("You entered: $intValue")
            break
        } catch (e: NumberFormatException) {
            println("Invalid input. Try again.")
        }
    }
}