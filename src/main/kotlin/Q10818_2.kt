import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) =with(BufferedReader(InputStreamReader(System.`in`))){

    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = readLine().toInt()

    val array = IntArray(n)
    // val array = arrayOfNulls<Int>(n)

    StringTokenizer(readLine()).run {
        for(i in 0 until n){
            array[i] = nextToken().toInt()
        }
    }

    bw.write("${Arrays.stream(array).min().asInt}${Arrays.stream(array).max().asInt}")
    bw.flush()
    bw.close()



}


