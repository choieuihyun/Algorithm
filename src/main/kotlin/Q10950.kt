import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) =with(BufferedReader(InputStreamReader(System.`in`))){

    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = readLine().toInt()

    for(i in 0 until n) {
        val a = StringTokenizer(readLine())
        val b = a.nextToken().toInt()
        val c = a.nextToken().toInt()

        bw.write("${b+c}" + "\n")
    }


    bw.flush()

}
