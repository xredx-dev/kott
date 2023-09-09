package basicstypes

fun main() {
    // CONECTAR CADENAS
    val  saludo: String = "Hola";
    val world:String = "mundo";
    var result:String?;

    result = "Hola" + " " + world;
    println("Saludo: $result !! <- 1°");

    result= saludo.plus(" ").plus(world).plus("!! <- 2°");
    println(result);

    //Templates

    result = "$saludo $world !! <- 3°";
    println(result);

    //Multiples lineas

    result = """
        | Tell me an I forget.
        | Teach me and I remember.
        | Involve me and I learn.
        | (Benjamin Franklin)
    """;

    println(result);
}