import kotlin.math.sqrt

fun main() {
    var a = readLine()?.toInt() ?: 0
    var b = readLine()?.toInt() ?: 0
    var c = readLine()?.toInt() ?: 0
    while (b > (a + c) || c > (a + b) || a > (c + b)) {
        println("кароч не правильно")
        a = readLine()!!.toInt()
        b = readLine()!!.toInt()
        c = readLine()!!.toInt()
    }

    println("Ты молодец,наверняка матешу не прогуливал")

    val p = perimeter(a, b, c)
    val s = square(
        a.toDouble(), b.toDouble(),
        c.toDouble(), p.toDouble()
    )
    println("Периметр равен $p")
    println("Площадь равна $s")
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
//сделай так чтобы программа спрашивала данные пока пользователь не ведёт их правильно
//if ( b > a + c && c > a + b && a > c + b) {
//  println("неправильно пиши ещё раз")
//}