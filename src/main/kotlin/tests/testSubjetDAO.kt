package tests

import Labs.Subject
import dao.SubjectDAO
import interfaces.SubjectRepository

fun main() {
    val subjectDAO: SubjectRepository = SubjectDAO()
    val subject = Subject(id = 1, name = "Matemáticas")

    println("Saving Subject:")
    val savedSubject = subjectDAO.save(subject)
    println("Saved Subject: ${savedSubject.name}")

    println("\nUpdating Subject:")
    val updatedSubject = subjectDAO.update(subject)
    println("Updated Subject: ${updatedSubject.name}")

    val subjectIdToDelete = 1
    println("\nDeleting Subject with ID $subjectIdToDelete:")
    subjectDAO.deleteByID(subjectIdToDelete)
}
