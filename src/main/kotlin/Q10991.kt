import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val n = nextInt()

    for(i in 0 until n) {
        for (j in 0 until n * 2) {
            if (i % 2 == 0) {
                when {
                    j < n-i-1 || j > n-1 -> print(" ")
                    else -> print("* ")
                }
            } else {
                when {
                    j < n-i-1 || j > n-1 -> print(" ")
                    else -> print("* ")
                }
            } //n이 5이고 i가 1일때 생각해보자

        }
        println()
    }

}
