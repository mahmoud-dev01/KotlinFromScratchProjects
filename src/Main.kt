import kotlin.math.*
import kotlin.reflect.KFunction

fun main() {

    val x = 100.0
    val y = 10.0

    val squareRoot: String = "the square root of $x is: ${sqrt(x)}"
    val toThePower2: String = "$y raised to the 2nd power is: ${y.pow(2.0)}"

    println(squareRoot)
    println(toThePower2)

    println(add(y = 5 ,x = 2))

    println("Mahmoud".greet())

    selectedFunction(5.5, 5.0F)
}

fun add(x: Int, y: Int): Int = x + y
fun add(x: Double, y: Double): Double = x + y
//fun add(x: Double, y: Double): Double = x * y
fun multiply(x: Double, y: Float): Double = x * y

fun String.greet(greeting: String = "Hello"): String =
    "$greeting, $this!"

val useAdd = true
val selectedFunction = if (useAdd) ::add else ::multiply