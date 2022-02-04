import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(args: Array<String>) {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val count = br.readLine()?.toInt()?:0

    repeat(count) {
        bw.write("${br.readLine()!!.split(' ').map {it.toInt()}.sum()}")
        bw.newLine()
    }

    bw.flush()
    bw.close()

}

