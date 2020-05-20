import kotlin.math.pow
fun main() {
    val x: Double = readLine()?.toDouble() ?: 0.0
    val y: Double = readLine()?.toDouble() ?: 0.0
    val r1: Double = readLine()?.toDouble() ?: 0.0
    val a: Double = x.pow(2) + y.pow(2)
    if (a < r1)
        println("точка а входит в круг")
    else
        println("точка не входит в круг")
}