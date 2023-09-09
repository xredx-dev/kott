package Controlflow

fun main() {
    //IF ELSE

    // 1° Condicional
    val a = 4;
    val b = 2;

    var max = a;
    if ( a < b) max = b;

    println("Resultado de la primera condicional $max");

    // 2° Condicional
    var result = if (a > b){
        max = a;
    }else{
        max = b;
    }
    println("Resultado de la segunda condicional: $result");

    //3° condicional
    val num = -50

    val res = if (num > 0){
        "El número es positivo"
    }else{
        "El número es negativo"
    }

    println("Resultado de la tercera condicional: $res");

    //4° condicional
    val x = if (a > b){
        println("$a es mayor que $b")
        a
    }else{
        println("$a es menor o igual que $b")
        b
    }

    println("Resultado de la cuarta condiconal: $x");


    //When
    when(b){
        1 -> print("b === 1");
        2 -> print("b === 2");
        else ->{
            print("b no es 1 o 2")
        }
    }
}