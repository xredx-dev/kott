package Labs

import kotlin.math.PI

fun calcularAreaBase(radio: Double): Double {
    return PI * radio * radio
}

fun calcularAreaLateral(radio: Double, altura: Double): Double {
    return 2 * PI * radio * altura
}

fun calcularAreaCilindro(radio: Double, altura: Double, calcularAreaBase: (Double) -> Double, calcularAreaLateral: (Double, Double) -> Double): Double {
    val areaBase = calcularAreaBase(radio)
    val areaLateral = calcularAreaLateral(radio, altura)
    return areaBase + areaLateral
}

fun main() {
    val radio = 3.0
    val altura = 5.0

    val areaTotal = calcularAreaCilindro(radio, altura, ::calcularAreaBase, ::calcularAreaLateral)

    println("El área total del cilindro es: $areaTotal")
}
