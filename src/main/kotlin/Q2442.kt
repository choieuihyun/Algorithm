import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val n = nextInt()

    for(i in 0 until n) {
        for(j in 0 until n*2-1){
            if(j < n - i - 1)
                print(" ")
            else if(j < n + i)
                print("*")
        }
        println()
    }

}