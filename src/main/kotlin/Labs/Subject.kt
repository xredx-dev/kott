package Labs

class Subject(val id: Int = 0, val name: String = "") {
    //constructor(name: String, id: Int) : this(id, name) {}
    /*
    el constructor comentado se desactiva cuando haces el test, por que sale un error de ambiguedad
     */

    fun action() {
        println("Materia: $name")
    }
}

fun main() {
    val subject1 = Subject(1,"Matemáticas", )
    val subject2 = Subject(4,"Ciencias de la Computación", )

    subject1.action()
    subject2.action()
}
