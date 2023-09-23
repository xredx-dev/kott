package Labs

val calcularAreaCilindro:(Double,Double) -> Double ={radio,altura -> 2*Math.PI * radio*(radio + altura)}

fun main() {
    val radio = 3.0
    val altura = 5.0

    val areaTotal = calcularAreaCilindro(radio,altura)
    println("El area total del cilindro es: $areaTotal");
}