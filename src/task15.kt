fun main() {
    val sdCnt = readLine()!!.toInt()
    var i = 0
    var p = 0

    while (i < sdCnt) {
        val sd = readLine()!!.toInt()
        if (sd <= 0)
            break

        p += sd
        i++
        if (i == sdCnt) {
            println(p)
            p = 0
            i = 0
        }
    }
}