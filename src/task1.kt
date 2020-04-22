import kotlin.math.PI

fun main() {
    val d: Double = readLine()?.toDouble() ?: 0.0
    val r: Double = d / 2.0
    val s: Double = sphe(r)
    val v: Double = sph2(r)
    println("площадь полной поверхности = $s")
    println("объём шара = $v")
}

fun sphe(r: Double): Double {
    val s: Double = 4.0 * PI * r * r
    return s
}

fun sph2(r: Double): Double {
    val v: Double = (4.0 * PI * r * r * r) / 3.0
    return v
}


