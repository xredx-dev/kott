package lambda

fun main() {
    val simpleSumLambda:(Int) -> Int = {x:Int ->x +x};
    var resultSimpleSumLambda:Int =simpleSumLambda(5);

    println("Result of simpleSumLambda, parameter: 5 = $resultSimpleSumLambda");

    val sumLambda:(Int,Int) -> Int = {x:Int,y:Int -> x + y};
    var resultSumLambda:Int = sumLambda(5,10);

    println("Result of sumLambda, parameters: 5 , 10 = $resultSumLambda");
}