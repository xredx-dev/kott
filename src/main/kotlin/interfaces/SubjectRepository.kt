package interfaces

import Labs.Subject

interface SubjectRepository {
    fun save(subject: Subject): Subject
    fun update(subject: Subject): Subject
    fun deleteByID(id: Int)
}
