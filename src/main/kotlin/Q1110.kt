import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) =with(BufferedReader(InputStreamReader(System.`in`))){

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var a = readLine().toInt()
    val copy = a
    var count = 0

    while(true){
        a = (a%10) * 10 + ((a/10 + a%10) % 10)
        count++

        if(a == copy) {
            break
        }
    }
    bw.write("$count")
    bw.flush()






}