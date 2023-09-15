package Labs

import Classes.Person

class CollegeStudent(id: Int, name: String, status: Boolean) : Person(id, name, status) {
    constructor(id: Int, name: String) : this(id, name, false)

    override fun isApproved(): Boolean {
        println("No aprobó su décimo cuatrimestre en la UTVT")
        return false
    }
}

fun main() {
    val collegeStudent1 = CollegeStudent(1, "Fernanda", true)
    println("Student 1 - Name: ${collegeStudent1.name}, Approved: ${collegeStudent1.isApproved()}")
}
