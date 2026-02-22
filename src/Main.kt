fun main() {
    val x: Int? = readlnOrNull()?.toInt() ?: 0
    when {
        x!! > 0 -> println("x is positive")
        x!! == 0 -> println("x is zero")
        x!! < 0 -> println("x is negative")
        else -> println("x is not real number")
    }

    val hour = readln().toInt()
    when (hour) {
        in 0 .. 11 -> println("Good Morning")
        in 12 .. 16 -> println("Good Afternoon")
        in 17 .. 23 -> println("Good Evening")
        else -> println("Invalid hour")
    }
}