import kotlin.math.abs
import kotlin.math.hypot

fun main() {
    val cntrX1 = readLine()?.toDouble() ?: 0.0
    val cntrY1 = readLine()?.toDouble() ?: 0.0
    val cntrX2 = readLine()?.toDouble() ?: 0.0
    val cntrY2 = readLine()?.toDouble() ?: 0.0
    val rds1 = readLine()?.toDouble() ?: 0.0
    val rds2 = readLine()?.toDouble() ?: 0.0
    val distance = hypot(cntrX1 - cntrX2,
                         cntrY1 - cntrY2)
    if (distance < abs(rds1 - rds2)) {
        println("один внутри другого")
    } else if (distance < (rds1 + rds2) ) {
        println("пересекаются")
    } else {
        println("не пересекаются")
    }
}
//если расстояние между центрами меньше разности радиусов
//пересекаются если расстояние между центрами меньше суммы радиусов
//а третий просто в элс закинем