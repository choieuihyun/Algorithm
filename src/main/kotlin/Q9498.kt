fun main(args: Array<String>) {

    var score = readLine()!!.toInt()

    if(score in 90..100)
        print("A")
    else if(score in 80..89)
        print("B")
    else if(score in 70..79)
        print("C")
    else if(score in 60..69)
        print("D")
    else
        print("F")
}

