import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(args: Array<String>) =with(BufferedReader(InputStreamReader(System.`in`))) {

    val a = readLine().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))



    for(i in 0 until a){
        val n = StringTokenizer(readLine())
        val b = n.nextToken().toInt()
        val c = n.nextToken().toInt()

        bw.write("Case #${i}: " + "${b+c}\n")
    }

    bw.flush()
    bw.close()


}

