fun main() {

    val a = "Hello,"
    val b = "world!"
    var c = a + " " + b
    println(c)
    c = a.plus(" $b")
    println(c.uppercase())
    println(a.plus(" ").plus(b))

    val builderMessage = buildString {
        append("Hello")
        append(" ")
        append("world!")
    }
    println(builderMessage)

    val name = "John"
    val age = 30
    // using escape characters in string template
    val message = "Name: $name\nAge: $age"
    println(message)
}