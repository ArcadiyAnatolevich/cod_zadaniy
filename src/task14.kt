fun main() {
    val n: Int = readLine()?.toInt() ?: 0
    var f0 = 0
    var f1 = 1
    for (i in 1..n) {
        val t = f0 + f1
        f0 = f1
        f1 = t
        i / 2
        println(i)

        print("$f0, ")
    }
}

fun f2() {
    val fMax: Int = readLine()?.toInt() ?: 0
    var f0 = 0
    var f1 = 1
    while (fMax > f1) {
        val t = f0 + f1
        f0 = f1
        f1 = t
        print("$f0, ")
    }
}
