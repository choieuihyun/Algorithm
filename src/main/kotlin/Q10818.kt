import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.max

fun main(args: Array<String>) =with(BufferedReader(InputStreamReader(System.`in`))){

    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = readLine().toInt()
    val st = StringTokenizer(readLine()) // 여기서 뭐 기준이 없으니까 공백기준으로 받아온 문자열 자르고
    var max = -1000000
    var min = 1000000

    val array = IntArray(n,{0})
    // val array = arrayOfNulls<Int>(n)

    for(i in 1..n) {
        val arr = st.nextToken().toInt() // for문을 n번만큼 돌리니까 n번만큼 정수로 지정 즉 n에 5쓰고 st에 1 2 3 4 5 들어가면 5번 정수로 지정
        array[i-1] = arr

        if(max < array[i-1]) {
            max = array[i-1]
        }
        if(min > array[i-1]) {
            min = array[i - 1]
        }
    }

    bw.write(min.toString() + " " + max.toString())

    bw.flush()
    bw.close()




}


