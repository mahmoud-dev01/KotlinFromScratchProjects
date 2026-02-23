fun main() {

    applyFunctionMessage(
        functionMessage =::printMessage,
        input = "Hello, World!"
    )
    applyFunctionMessage(functionMessage = { text ->
        printMessage(text)
    }, input = "Hello, World!")

    val result = run {
        val x = 10
        val y = 20
        x + y
    }
    println(result)
}
fun printMessage(text: String): Unit =
    println(text)

fun applyFunctionMessage(functionMessage: (String) -> Unit, input: String): Unit =
    functionMessage(input)