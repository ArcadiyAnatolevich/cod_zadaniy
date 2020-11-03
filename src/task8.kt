import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val a = readLine()?.toDouble() ?: 0.0
    val b = readLine()?.toDouble() ?: 0.0
    val c = readLine()?.toDouble() ?: 0.0
    val d = b.pow(2) - 4 * a * c
    val x1: Double
    val x2: Double
    if (d > 0) {
        x2 = (-b - sqrt(d)) / (2 * a)
        x1 = (-b + sqrt(d)) / (2 * a)
        println("корни уравнения: $x1 $x2")
    } else if (d < 0) {
        println("корней нет")
    } else {
        x1 = -b / (2 * a)
        println("$x1 корень")
    }
}
