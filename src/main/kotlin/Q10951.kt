import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(args: Array<String>) =with(BufferedReader(InputStreamReader(System.`in`))){

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true) {

        val st = StringTokenizer(readLine())

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()


        if(a==0 && b==0) {
            break
        }
        bw.write("${a+b}\n")


    }
    bw.flush()
    bw.close()

}
