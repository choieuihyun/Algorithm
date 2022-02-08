import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) =with(BufferedReader(InputStreamReader(System.`in`))) {

    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val a = readLine().toInt()
    val n = readLine() // readLine은 어떤 값을 받더라도 자료형으로 반환하기 때문에 계산에 이용하기위해선 변환해야함
    var sum = 0

    println(n[1])

    for(i in 0 until a) {
        sum += n[i].toString().toInt()
    }

    println(sum)




}