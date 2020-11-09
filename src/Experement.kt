import kotlin.random.Random

fun main() {
  val a: Int = readLine()?.toInt() ?: 0
  val b: Int = readLine()?.toInt() ?: 0
  val l: Int = readLine()?.toInt() ?: 0
  val d: Int = readLine()?.toInt() ?: 0
    val seps = b..a
    val g = Random.nextInt(l, d)

    for (value in seps step g) {
        println("$value")
    }
}
//a = Random.nextInt(0, 32)