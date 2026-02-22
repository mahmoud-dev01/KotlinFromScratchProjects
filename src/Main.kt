fun main() {

    for (index: Int in 0 .. 4) {
        println("Current value of index is: $index")
        if (index == 4) println("-----")
    }
    for (index: Int in 0 until 5 /*step 2*/) {
        println("Current value of index is: $index")
        if (index == 4) println("-----")
    }
    for (index: Int in 5 downTo 0)
        println("Current value of index: $index")

    for (i in 1 .. 4) {
        if (i == 3) continue
        println("index: $i")
    }

    for (i in 1 .. 4) {
        if (i == 3) break
        println("index: $i")
    }
}