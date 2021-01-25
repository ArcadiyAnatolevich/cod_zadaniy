fun main() {
    var f0 = 0
    val fLim: Int = readLine()?.toInt() ?: 0
    var f1 = 1
    var sum = 0
    var k = 0
    while (1 < fLim) {
        val t = f0 + f1
        f0 = f1
        f1 = t
        print("$f0, ")
        val v = f0 % 2
        if (v > 0) {
            sum++
            println(sum)

        } else {
            println(0)
        }
    }
}
