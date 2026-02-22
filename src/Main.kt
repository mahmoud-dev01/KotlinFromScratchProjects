fun main() {

    var str: String? = "Hello, Kotlin!"
    str = null

    // Method 1
    val len: Int = if (str != null) str.length else -1
    println(len)
    // Method 2
    val len2: Int? = str?.length
    println(len2)
    // Method 3
    val len3 = str?.length ?: -1

    var name: String? = "Mahmoud"
    println(name!!.length)
}