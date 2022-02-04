import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    for(i in 1..nextInt()){
        val a = nextInt()
        val b = nextInt()

        println("Case $i: $a + $b = ${a+b}")
    }




}