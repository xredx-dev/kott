package dao

import Labs.Subject
import interfaces.SubjectRepository

class SubjectDAO : SubjectRepository {
    private val subjects = mutableMapOf<Int, Subject>()

    override fun save(subject: Subject): Subject {
        subjects[subject.id] = subject
        return subject
    }

    override fun update(subject: Subject): Subject {
        if (subjects.containsKey(subject.id)) {
            subjects[subject.id] = subject
        } else {
            throw IllegalArgumentException("Subject with ID ${subject.id} does not exist.")
        }
        return subject
    }

    override fun deleteByID(id: Int) {
        subjects.remove(id)
    }
}
