fun main(args: Array<String>) {

    var H = readLine()!!.toInt()
    var M = readLine()!!.toInt()

    if(M < 45) {
        H--
        M += 15
        if(H <= 0)
            H = 23

        print(H)
        print(" ")
        print(M)
    }
    else {
    print(H)
    print(" ")
    print(M-45)
    }
}
