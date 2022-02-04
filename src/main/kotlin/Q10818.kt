import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.max

fun main(args: Array<String>) =with(BufferedReader(InputStreamReader(System.`in`))){

    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    var max = -1000000
    var min = 1000000

    val array = IntArray(n,{0})
    // val array = arrayOfNulls<Int>(n)

    for(i in 1..n) {
        val arr = st.nextToken().toInt()
        array[i-1] = arr

        if(max < array[i-1]) {
            max = array[i-1]
        }
        if(min > array[i-1]) {
            min = array[i - 1]
        }
    }

    bw.write(max.toString())
    bw.write(min.toString())
    bw.flush()
    bw.close()




}


