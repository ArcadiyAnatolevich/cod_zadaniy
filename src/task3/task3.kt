
fun main() {
    val a: Int = readLine()?.toInt() ?: 0
    if (a in 2..32)
        println("между 2 и 32")
    else if(a > 32)
        println("больше 32")
    else(a > 2)
    println("меньше 2")
}
