fun main() {
    val n: Int = readLine()?.toInt() ?: 0
    for (i in 0..n) {
        when {
            i % 5 == 0 && i % 3 == 0 -> println("яблоко-апельсин")
            i % 5 == 0 -> println("апельсин")
            i % 3 == 0 -> println("яблоко")
            else -> println("$i")
        }
    }
}

/*when(0) {
    i % 15 -> println("яблоко-апельсин")
    i % 5 -> println("апельсин")
    i % 3 -> println("яблоко")
    else -> println(i)*/
