package tests

import Classes.Person
import dao.PersonDAO


fun main() {
    val personDAO = PersonDAO()
    val person = Person(id = 1, name = "Rafael", status = true)

    println("Saving Person:")
    val savedPerson = personDAO.save(person)
    println("Saved Person: ${savedPerson.name}")

    println("\nUpdating Person:")
    val updatedPerson = personDAO.update(person)
    println("Updated Person: ${updatedPerson.name}")

    val personIdToDelete = 1
    println("\nDeleting Person with ID $personIdToDelete:")
    personDAO.deleteByID(personIdToDelete)
}
