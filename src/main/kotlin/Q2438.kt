import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val n = nextInt()

    for(i in 1..n) {
        print(" ".repeat(n-i))
        println("*".repeat(i))
    }

}