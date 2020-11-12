package tmp

import kotlin.math.roundToInt

fun main() {
    val h = readLine()?.toInt() ?: 0
    val b = readLine()?.toInt() ?: 0
    val a = readLine()?.toInt() ?: 0
    val v = readLine()?.toInt() ?: 0
    val n = readLine()?.toInt() ?: 0
    val p = par(a, b, h)
    val fv = v * n
    val c = cal(p, fv)
    val z = cir(fv, p)
    println("Кол-во вагонов равна $c")
    println("Процент загружености последнего вагона равен $z")
}

fun par(a: Int, b: Int, h: Int): Int {
    return a * b * h
}

fun cal(p: Int, fv: Int): Int {
    var c = fv / p
    if ((fv % p) > 0) {
        c += 1
    }
    return c
}

fun cir(fv: Int, p: Int): Int {
    val z = fv.toFloat() / p.toFloat() * 100
    return z.roundToInt()
}
