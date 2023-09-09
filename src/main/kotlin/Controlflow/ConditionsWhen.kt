package Controlflow

fun main() {
// 1° Condicional
    val a = 4
    val b = 2

    var max = when {
        a < b -> b
        else -> a
    }

    println("Resultado de la primera condicional $max")

// 2° Condicional
    var result = when {
        a > b -> {
            max = a
            a
        }
        else -> {
            max = b
            b
        }
    }
    println("Resultado de la segunda condicional: $result")

// 3° Condicional
    val num = -50

    val res = when {
        num > 0 -> "El número es positivo"
        else -> "El número es negativo"
    }

    println("Resultado de la tercera condicional: $res")

// 4° Condicional
    val x = when {
        a > b -> {
            println("$a es mayor que $b")
            a
        }
        else -> {
            println("$a es menor o igual que $b")
            b
        }
    }


}