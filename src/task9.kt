import kotlin.math.sqrt

fun main() {
    val a = readLine()?.toInt() ?: 0
    val b = readLine()?.toInt() ?: 0
    val c = readLine()?.toInt() ?: 0
    //if (b <= c + a && c <= b + a && a <= b + c) {
    if (b <= c + a && c <= b + a && a <= b + c) {
        val p = perimeter(a, b, c)
        val s = square(
            a.toDouble(), b.toDouble(),
            c.toDouble(), p.toDouble()
        )
        println("Периметр равен $p")
        println("Площадь равна $s")
    } else {
        println("не существует")
    }
}

fun perimeter(a: Int, b: Int, c: Int): Int {
    val p = a + b + c
    return p
}

fun square(a: Double, b: Double, c: Double, p: Double): Double {
    val hp = p / 2
    val s = sqrt(hp * (hp - a) * (hp - b) * (hp - c))
    return s
}
