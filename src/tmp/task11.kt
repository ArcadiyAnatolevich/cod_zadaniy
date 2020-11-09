fun main() {
    val h: Int = readLine()?.toInt() ?: 0
    val b: Int = readLine()?.toInt() ?: 0
    val a: Int = readLine()?.toInt() ?: 0
    val v: Int = readLine()?.toInt() ?: 0
    val n: Int = readLine()?.toInt() ?: 0
    val p: Int = par(a, b, h)
    val с: Int = cal(p, v, n)
    println("Кол-во грузовиков равна $с")
}

fun par(a: Int, b: Int, h: Int): Int {
    val p: Int = a * b * h
    return p
}

fun cal(p: Int, v: Int, n: Int): Int {
    val c: Int = p - (v * n)
    return c
}
