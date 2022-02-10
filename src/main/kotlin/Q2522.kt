import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val n = nextInt()

    for(i in 0 until n*2-1) {
        for(j in 0 until n) {
            if(i < n) {
                when {
                    j < n-i-1 -> print(" ")
                    else -> print("*")
                    //j >= n-i-1 -> print("*")
                }
            }
            else {
                when {
                    j <= i-n -> print(" ")
                    else -> print("*")
                }
            }

            }
        println()
        }

    }
