fun main() {
    val ax: Int = readLine()?.toInt() ?: 0
    val ay: Int = readLine()?.toInt() ?: 0
    val c: Int = cube(ax, ay)
    println(c)
}

fun cube(ax: Int, ay: Int): Int {
    if (ax in 2..32 && ay in 2..32)
        return 0
    else if (ax < 2 && ay < 2)
        return -1
    else
        return 1
}