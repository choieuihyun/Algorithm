import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStream
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    //StringTokenizer : 문자열을 하나씩 쪼갬
    val st1 = StringTokenizer(br.readLine())
    val st2 = StringTokenizer(br.readLine())

    //nextToken : 처음부터 하나씩 정수로 지정 10, 5 쓴거를 하나씩 쪼개는거구나.
    val n = st1.nextToken().toInt()
    val x = st1.nextToken().toInt()

    for(i in 1..n){
        val a = st2.nextToken().toInt()
        if(x > a)
            bw.write("$a")
    }
    bw.flush()


}