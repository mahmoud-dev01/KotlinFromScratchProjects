import java.io.File
import java.util.Scanner

fun main() {

    val inputFile = File("inputfile.txt")
    val outputFile = File("outputfile.txt")
    try {
        val scanner = Scanner(inputFile)
        while (scanner.hasNextLine()) {
            val line = scanner.nextLine()
            println(line)
        }
    } catch (e: Exception) {
        println("An error occurred: ${e.message}")
    }
   try {
       val lines = inputFile.readLines()
       for (line: String in lines) {
           outputFile.appendText("$line\n")
       }
       println("Copied inputfile.txt to outputfile.txt")
   } catch (e: Exception) {
       println("An error occurred: ${e.message}")
   }
}