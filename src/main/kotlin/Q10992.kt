import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val n = nextInt()

    for(i in 0 until n) {
        for(j in 0 until n*2) {
            when {
                i == n-1 && j < n*2-1 -> print("*")
                j < n-i-1 -> print(" ")
                j == n+i-1 -> print("*")
                j > n-i-1 -> print(" ")
                j < n -> print("*")

            }
        }
        println()
    }

}