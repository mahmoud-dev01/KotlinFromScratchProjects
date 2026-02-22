fun main() {

    var count = 0
    while (count < 4) {
        println("current value of count: $count")
        count++
    }

    count = 0
    while (true) {
        println("play: $count")
        when(readln().toInt()) {
            0 -> break
            1 -> continue
            else -> {
                count++
            }
        }
    }

    count = 0
    do {
        count++
        println(count)
    } while (count == 1)
}