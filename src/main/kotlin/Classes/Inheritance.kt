package Classes

fun main() {
    val person = Person(1, "Rafael", true)
    val universityStudent = UniversityStudent(2, "Luis Tenorio", false)

    val personIsApproved = person.isApproved()
    val universityStudentIsApproved = universityStudent.isApproved()

    println("La persona ${person.name} ${if (personIsApproved) "tiene" else "no tiene"} cursos aprobados.")
    println("El estudiante universitario ${universityStudent.name} ${if (universityStudentIsApproved) "tiene" else "no tiene"} cursos aprobados.")
}