package Labs

class Persona(val name: String = "Ian", val age: Int = 8)

fun main() {
    val persona1 = Persona()
    println("Persona 1 - Nombre: ${persona1.name}, Edad: ${persona1.age}")

    // Crear una instancia con datos personalizados
    val persona2 = Persona("Elianeth", 25)
    println("Persona 2 - Nombre: ${persona2.name}, Edad: ${persona2.age}")
}
