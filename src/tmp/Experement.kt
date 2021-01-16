package tmp

fun main() {
    val a1: Int = readLine()?.toInt() ?: 0
    val a2: Int = readLine()?.toInt() ?: 0
    val b1: Int = readLine()?.toInt() ?: 0
    val b2: Int = readLine()?.toInt() ?: 0
    val x1: Int = 3
    val y1: Int = 3
    val x2: Int = 6
    val y2: Int = 7
    val x: Int = 17
    val y: Int = 13
    val m: Int = clnrsMvng(a1, a2, b1, b2, x, y)
    if (m > x || m > y) {
        println("")
    }
}

fun clnrsMvng(a1: Int, a2: Int, b1: Int, b2: Int, x: Int, y: Int): Int {
    return 0;
}
/*val summarya1: Int = x - a1
    return summarya1
    val summarya2: Int = x - a2
    return summarya2
    val summaryb1: Int = y - b1
    return summaryb1
    val summaryb2: Int = y - b2
    return summaryb2*/
//тебе нужно будет превратить функцию которая назодется на восемнадцатой строке в цикл while

/*fun tmp.clnrsMvng(a1: Int, a2: Int, b1: Int, b2: Int, x: Int, y: Int): Int {
    val m: Int = x - a1
    x - a2
    y - b1
    y - b2
    return m
}*/