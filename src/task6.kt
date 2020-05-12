fun main() {
    var a: Int = readLine()?.toInt() ?: 0
    var b: Int = readLine()?.toInt() ?: 0
    var c: Int = readLine()?.toInt() ?: 0
    if (c < a && a > b) {
        a = c.also{ c = a}
    } else if(c < b && b > a) {
        b = c.also { c = b }
    } else if (b < a && c > b) {
        a = b.also { b = a }
    }
    if (c < a && a > b) {
        a = c.also{ c = a}
    } else if(c < b && b > a) {
        b = c.also { c = b }
    } else if (b < a && c > b) {
        a = b.also { b = a }
    }
    println("$a, $b, $c")
}