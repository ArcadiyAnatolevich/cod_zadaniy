fun main() {
    val degree: Double = readLine()?.toDouble() ?: 0.0
    val string: String = readLine() ?: ""
    val c1: Double = readLine()?.toDouble() ?: 0.0
    val n: Double = nitr(c1)
    when(string) {
        "kc" -> println("из шкалы цельсия в шкалу кельвина = ${kalv(degree)}")
        "ck" -> println("из шкалы цельсия в шкалу кельвина = ${kal2(degree)}")
        "fc" -> println("из шкалы цельсия в шкалу фаренгейта = ${fare(degree)}")
        "cf" -> println("из шкалы фаренгейта в шкалу цельсия = ${far2(degree)}")
        "fk" -> println("из шкалы келвина в шкалу фаренгейта = ${kal3(degree)}")
        "kf" -> println("из шкалы фаренгейта в шкалу келвина = ${far3(degree)}")
    }
    println(n)
}

fun kalv(c: Double): Double {
    val kc: Double = c - 273.15
    return kc
}

fun kal2(k: Double): Double {
    val ck: Double = k + 273.15
    return ck
}

fun fare(f: Double): Double {
    val fc: Double = (f - 32)* 5 / 9
    return fc
}

fun far2(c: Double): Double {
    val cf: Double = 9 * (c + 32) / 5
    return cf
}

fun kal3(f: Double): Double {
    val fk: Double = 5 * (f - 32) / 9 + 273.15
    return fk
}

fun far3(k: Double): Double {
    val kf: Double = 9 * (k - 273.15) / 5 + 32
    return kf
}
fun nitr(c1: Double): Double {
    if (-273.15 > c1)
        println("иди физику учи!!")
    else
        println("молодец ты умный человек)))")
    return c1
}