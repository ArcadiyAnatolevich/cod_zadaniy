fun main() {
    val a: Int = readLine()?.toInt() ?: 0
    val l: Int = left(a)
    println(l)
}

fun left(a:Int): Int {
    if (a < 2)
        return 2
    else if (a in 2..32)
        return a
    else
        return 32
}