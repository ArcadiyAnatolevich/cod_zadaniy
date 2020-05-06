package tmp


fun main() {
    val day1: Int = readLine()?.toInt() ?: 0
    val today: Int = readLine()?.toInt() ?: 0
    val trueDay = (today + day1 - 2) % 7 + 1
    when (trueDay) {
        1 -> println("monday")
        2 -> println("tuesday")
        3 -> println("wednesday")
        4 -> println("thursday")
        5 -> println("friday")
        6 -> println("saturday")
        7 -> println("sunday")
        else -> {
            println("error")
        }
    }
}