import java.util.StringTokenizer

fun main(args: Array<String>) {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val arr = IntArray(10)
    var result = a * b * c

    while (result != 0) {
        arr[result % 10]++
        result /= 10
    }

    for (i in arr.indices) {
        println(arr[i])
    }
}

    /*val n = StringTokenizer((a*b*c).toString())

    val strList = ArrayList<Int>(n.countTokens())

    for(i in 0..n.countTokens()) {
        strList.add(n.nextToken().toInt())
    }

    print(strList[0])*/





