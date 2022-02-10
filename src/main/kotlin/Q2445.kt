import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val n = nextInt()

    for(i in 0 until n) {
        for(j in 0 .. n*2){
            if(j <= i || j >= n*2-i)
                print("*")
            else if(j == n)
                print("")
            else
                print(" ")
        }
        println()
    }

    for(i in 0 until n-1) {
        for(j in 0..n*2) {
            if(j < n-i-1 || j > n+i+1)
                print("*")
            else if(j == n)
                print("")
            else
                print(" ")
        }
        println()
        }

}