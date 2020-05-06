fun main() {
    val t: Double = readLine()?.toDouble() ?: 0.0
    val f: Double = readLine()?.toDouble() ?: 0.0
    val d: Double = readLine()?.toDouble() ?: 0.0
    val t2 = (t * 1.8 + 32)
    val f2 = (f - 32 * (5 / 9))
    when(d){
       t -> println("по шкале фаренгейта = $t2")
       f -> println("по шкале цельсия = $f2")
    }
}