import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    for(i in 1..n){
        println("Case #$i :" + token.nextToken().toInt()*token.nextToken().toInt())

    }

}

