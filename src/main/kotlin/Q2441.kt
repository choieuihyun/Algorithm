import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val n = nextInt()

    for(i in 1..n){
        for(j in 1..n){
            if(j >= i)
                print("*")
            else
                print(" ")
        }
        println()
    }

}