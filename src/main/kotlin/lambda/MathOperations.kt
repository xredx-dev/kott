package lambda

fun calculateOperation(x: Double, y: Double, operation:(x:Double, y:Double)->Double): Double {
    return  operation(x,y)
}
fun main():Unit {
    val x = 10.0;
    val y = 5.0;

    println("Parametros: $x y $y");

    val addition:Double = calculateOperation(x,y){x,y ->x + y}
    println("Result of addition is $addition");

    val subtraction:Double = calculateOperation(x,y){x,y ->x - y}
    println("Result of addition is $subtraction");

    val multiplication:Double = calculateOperation(x,y){x,y ->x * y}
    println("Result of addition is $multiplication");

    val divicion:Double = calculateOperation(x,y){x,y ->x / y}
    println("Result of addition is $divicion");
}