import kotlin.math.pow
import kotlin.math.sqrt

fun main()  {
    val a: Double = readLine()?.toDouble() ?: 0.0
    val s: Double = pure(a)
    val v: Double = pur2(a)
    println("площадь повехности пирамиды = $s")
    println("объём пирамиды = $v")
}

fun pure(a:Double):Double {
    val s: Double = a.pow(2) * sqrt(3.0)
    return s
}

fun pur2(a:Double):Double {
    val v: Double = (a.pow(3) * sqrt(2.0)) / 12.0
    return v
}
