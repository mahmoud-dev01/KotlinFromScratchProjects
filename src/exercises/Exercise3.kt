package exercises

val max: (Int, Int) -> Int = { a, b -> if (a >= b) a else b }

val newStringReversed: (String) -> String? = { text ->
    var reversed: String = ""
    for (index in text.indices) {
        reversed += text[(text.length -1) - index]
    }
    reversed
}

fun main() {
    println(max(2, 3))
    println(newStringReversed("Kotlin"))
}