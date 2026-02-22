fun main() {

    val size: Int = 4
    Line@ for (i in 1 .. size) {
        Star@ for (j in 1 .. size) {
            print("* ")
        }
        println()
    }

    Loop1@ for (i in 1 .. 5) {
        Loop2@ for (j in 1 .. 5) {
            print("$i,$j ")
            if (i == j) {
                println()
                continue@Loop1
            }
        }
    }
}