fun main() {

    val greet: (String) -> String = { name -> "Hello $name!" }

    println(greet("Alica"))
    println(greet("Bob"))
    println(
        apply { name ->
            greet(name)
        }("Mahmoud")
    )
}
fun apply(func: (String) -> String): (String) -> String {
    return { name -> func(name) }
}