package labs

fun main() {
    val altura = 9

    for (i in 1..altura) {

        for (j in 1..(altura - i)) {
            print(" ")
        }


        for (k in 1..(2 * i - 1)) {
            print("*")
        }

        println()
    }

    println("Hecho por Rafael Eduardo Rosales Rivas");
}
