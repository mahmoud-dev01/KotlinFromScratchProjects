package project1

import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.exp
import kotlin.math.ln
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.tan
import kotlin.system.exitProcess

var isOneNumber: Boolean = true

fun main() {

    println("*** Console Calculator ***")
    showChoices()
    val operation = getArithmeticOperation()
    println(operation)
    if (!isOneNumber) {
        println("Enter two numbers:")
        val number1: Double = readDoubleInput(prompt = "Number1: ")
        val number2: Double = readDoubleInput(prompt = "Number2: ")
        val result: Double = performCalculation(number1, number2, operation)
        println("\nResult:\n$number1 $operation $number2 = $result")
    } else {
        println("Enter one number:")
        val number: Double = readDoubleInput(prompt = "Number: ")
        val result: Double = performCalculation(number1 = number, operation = operation)
        println("\nResult:\n$number $operation = $result")
    }
}

fun performCalculation(number1: Double, number2: Double = 0.0, operation: String): Double =
    when(operation) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "*" -> number1 * number2
        "/" -> if (number2 != 0.0) number1 / number2 else {
            println("\nDivision by zero is not allowed. Exiting.")
            exitProcess(3)
        }
        "%" -> number1 % number2
        "^" -> {
            //number1.pow(number2)
            var n: Double = 1.0
            repeat(number2.toInt()) {
                n *= number1
            }
            n
        }
        "√" -> sqrt(number1)
        "t" -> {
            val degree: Double = number1
            val radian: Double = (degree * PI) / 180.0
            println("tan: ${tan(radian)}, cos: ${cos(radian)}, sin: ${sin(radian)}")
            0.0
        }
        "e" -> exp(number1)
        "x" -> if (number1 > 0.0) ln(number1) else 0.0
        else -> {
            println("\nUnexpected error encountered. Exiting.")
            exitProcess(4)
        }
    }

fun getArithmeticOperation(): String {

    println("Enter an arithmetic operation (+, -, *, /, %, ^, √, t, e, x): ")
    val operation = readln()
    if ("+ - * / % ^ √ t e x".contains(operation, true)) {
        isOneNumber = "√ t e x".contains(operation, true)
    } else {
        println("\nInvalid operation. Exiting")
        exitProcess(2)
    }
    return operation
}

fun showChoices(): Unit = println(
    "Operation Options\n" +
            "1. Addition (+)\n" +
            "2. Subtraction (-)\n" +
            "3. Multiplication (*)\n" +
            "4. Division (/)\n" +
            "5. Modulo (%)\n" +
            "6. Power (^)\n" +
            "7. Square Root (√)\n" +
            "8. Trigonometry (t)\n" +
            "9. Exponential Function (e)\n" +
            "10. Natural Logarithm (x)"
)

fun readDoubleInput(prompt: String): Double {

    println(prompt)
    val number = readln()
    try {
        return number.toDouble()
    } catch (e: Exception) {
        println("Error reading input: ${e.message}")
        exitProcess(status = 1)
    }
}