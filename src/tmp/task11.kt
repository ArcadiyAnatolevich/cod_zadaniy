package tmp

import kotlin.math.roundToInt

fun main() {
    val height = readLine()?.toInt() ?: 0
    val width = readLine()?.toInt() ?: 0
    val length = readLine()?.toInt() ?: 0
    val volume = readLine()?.toInt() ?: 0
    val quantityOfCargo = readLine()?.toInt() ?: 0
    val parallelepiped = cube(length, width, height)
    val volumeAndQuantity = volume * quantityOfCargo
    val quantityOfBody = deductionOfCargo(parallelepiped, volumeAndQuantity)
    val percentageOfWagonLoad = deductionOfCargoRercentage(volumeAndQuantity, parallelepiped)
    println("Кол-во вагонов равна $quantityOfBody")
    println("Процент загружености последнего вагона равен $percentageOfWagonLoad")
}

fun cube(length: Int, width: Int, height: Int): Int {
    return length * width * height
}

fun deductionOfCargo(parallelepiped: Int, volumeAndQuantity: Int): Int {
    val quantityOfBody = volumeAndQuantity / parallelepiped + if ((volumeAndQuantity % parallelepiped) > 0) 1 else 0
    return quantityOfBody
}

fun deductionOfCargoRercentage(volumeAndQuantity: Int, quantityOfCargo: Int): Int {
    val percentageOfWagonLoad = volumeAndQuantity.toFloat() / quantityOfCargo.toFloat() * 100
    return percentageOfWagonLoad.roundToInt()
}
