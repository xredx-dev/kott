package basicstypes

import Classes.Course
import Labs.University

fun main() {
    println("Hello Kotlin by Rafael E.");

    val materia1:Course = Course();
    val materia:Course = Course(
        1,
        "Como evitar cualquier extra en 24 hrs",
        "Jorge Almeida"
    );
    println(materia);
    println(materia1);


    val universidad:University = University();
    println(universidad);
}