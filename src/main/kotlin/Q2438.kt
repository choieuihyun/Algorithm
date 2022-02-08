import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val n = nextInt()

    /*for(i in 1..n) {
        print(" ".repeat(n-i))
        println("*".repeat(i))
    }*/

    /*Q2439
    for(i in 1..n){
        for(j in n downTo 1){
            if(i >= j)
                print("*")
            else
                print(" ")
        }
        println()
    }*/

    //Q2440

    for(i in 1..n){
        for(j in n downTo i){
            print("*")
        }
        println()
    }

}