fun main() {
    val a: Int = readLine()?.toInt() ?: 0
    val c: Int = cube(a)
    println(c)
}
fun cube(a:Int):Int {
    if (a in 2.2..32.2)
        return 0
    else if(a < 2.2)
        return-1
    else
        return 1
}