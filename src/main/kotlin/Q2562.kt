import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

// 손수 알고리즘버전
fun main(args: Array<String>) =with(BufferedReader(InputStreamReader(System.`in`))){

    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val arr = IntArray(9)
    var max = 0
    val n = StringTokenizer(readLine())

    //val selectionSort = SelectionSort(arr)
    //val sortedArr = selectionSort.sort()

    for(i in 0 until 9) {

        arr[i] = n.nextToken().toInt()

        if(max < arr[i]){
            max = arr[i]
        }


    }

    var maxIndex = arr.indexOf(max)

    bw.write("${max}" + "\n" + "${maxIndex + 1}")
    bw.flush()
    bw.close()

}

/*private class SelectionSort(var arrNums: IntArray) {
    fun sort() : IntArray {
        var min:Int

        //작은 수를 먼저 찾는다.
        //<List>.indices는 배열의 인덱스를 가져온다
        for(i in arrNums.indices) {
            min = i
            for (j in i+1 until arrNums.size){
                if(arrNums[j] < arrNums[min]){
                    min =j
                }
            }
            changePosition(arrNums, min, i)
        }
        return arrNums
    }

    private fun changePosition(nums: IntArray, min: Int, i: Int) {
        var temp:Int
        temp = nums[min]
        nums[min] = nums[i]
        nums[i] = temp
    }
}*/



