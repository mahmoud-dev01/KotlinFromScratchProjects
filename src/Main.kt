fun main() {

    var resultWithParentheses = (5 + 3) * 2
    println("Result with parentheses: $resultWithParentheses")

    resultWithParentheses += 4
    println("Result with parentheses + 4: $resultWithParentheses")

    var s = "Johan Smith"
    println(s)
    s += " Jr."
    println("New Object: $s")

    resultWithParentheses--
    println("New Result: $resultWithParentheses")
    println("New Result: ${resultWithParentheses++}") // 19
    println("New Result: ${resultWithParentheses++}") // 20

    println(20 == 5) // false
    println("Hello" == "World") // false
    println("Hello" == "Hello".lowercase()) // false
    println("Hello" == "Hello") // ture
}