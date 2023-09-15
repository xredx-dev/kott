package dao

import Classes.Person
import interfaces.PersonRepository

class PersonDAO:PersonRepository {
    override fun save(person:Person):Person{
        println("New Person: ${person.name}");
        return person;
    }

    override fun update(person:Person):Person{
        println("Objet person updated: ${person.name}");
        return person;
    }

    override fun deleteById(id: Int) {
        TODO("Not yet implemented")
    }

    override fun deleteByID(id:Int) = println("Person whit id : $id has been deleted");
}