import java.util.*

fun main(args: Array<String>) =with(Scanner(System.`in`)){

    val n = nextInt()

    /*for(i in 0 until n*2-1) {
        for(j in 0 until n*2-1)
            if(i < n) {
                when {
                    j <= i-1 || j >= n*2-i-1 -> print(" ")
                    else -> print("*")
                }
            }
        else {
            when {
                j < n*2-i-2 || j >= n*2 -> print(" ")
                else -> print("*")
            }
        }

        println()
    }*/

    for(i in 0 until n) {
        for(j in 0 until n*2){
            when {
                j < i -> print(" ")
                j < n*2-i-1 -> print("*")
            }
        }
        println()
    }

    for(i in n-2 downTo 0){
        for(j in 0 until n*2){
            when {
                j < i -> print(" ")
                j < n*2-i-1 -> print("*")
            }
        }
        println()
    }


}
