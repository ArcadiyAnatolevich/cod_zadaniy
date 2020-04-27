
fun main() {
    val a: Int = readLine()?.toInt() ?: 0
    if (a in 2..32)
        println("больше 2 и меньше 32")
    else
        println("больше 32")
}
