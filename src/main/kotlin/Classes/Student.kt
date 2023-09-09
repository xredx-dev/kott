package Classes

class Student {
    fun action() {
        val message = "It's going to approve";
        println(message);
    }
}

fun main(){
    val student = Student()
    student.action()
}