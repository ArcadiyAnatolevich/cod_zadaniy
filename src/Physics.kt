fun main() {
    val f2: Int = readLine()?.toInt() ?: 0
    val m: Int = readLine()?.toInt() ?: 0
    val g: Double = 9.8
    val a: Int = readLine()?.toInt() ?: 0
    val f: Int = scnd(m, a)
    val f3: Int = thrst(m, f, a)
    val ft: Double = grvt(m, g)
    println("Третий заклг Ньютона $f3")
    println("Второй закон Нбютона $f2")
    println("Закон тяготения $ft")
}


fun scnd(m: Int, a: Int): Int {
    val f: Int = m * a
    return f
}

fun thrst(m: Int, a: Int, f: Int): Int {
    val f2: Int = -m * -a
    val f3: Boolean = f == f2
    return f2
}

fun grvt(m: Int, g: Double): Double {
    val ft: Double = m * g
    return ft
}
