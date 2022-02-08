import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){

    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val br = StringTokenizer(readLine())

    var sum: Int = 0

    var month = br.nextToken().toInt()
    var day = br.nextToken().toInt()

    val months = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    for(i in 0 .. month+1) {

        if(i == month)
            break

        sum += months[i]
    }

    // 요일 구하기
    val dayofWeek = (sum + day) % 7

    when(dayofWeek){
        1 -> print("MON")
        2 -> print("TUE")
        3 -> print("WED")
        4 -> print("THU")
        5 -> print("FRI")
        6 -> print("SAT")
        0 -> print("SUN")

    }





}
