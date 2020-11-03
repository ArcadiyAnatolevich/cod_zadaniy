import kotlin.math.absoluteValue
import kotlin.random.Random
fun main() {
    val a = -16
    val b = +16
    var c = readLine()!!.toInt()
    while (c !in a..b) {
        c = readLine()!!.toInt()
    }

    var r: Int
    var m = 64
    var n = readLine()!!.toInt()
    while (n <= 0){
        n = readLine()!!.toInt()
    }

    var i = 0
    while (i < n) {
        r = Random.nextInt(a, b)
        if ((c - r).absoluteValue > m) {
            m = r
        }
        i += 1
        print("$r ")
    }
    println()
    println(m)
}
