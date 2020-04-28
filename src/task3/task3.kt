fun main() {
    val a: Int = readLine()?.toInt() ?: 0

    fun norm() {
        if (a in 2..32)
            println("между 2 и 32")
    }

    fun right() {
        else if (a > 32)
            println("больше 32")
    }

    fun left() {
        else (a < 2)
        println("меньше 2")
    }
}

