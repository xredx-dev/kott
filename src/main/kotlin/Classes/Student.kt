package Classes

class Student(val name:String = "Rafael", val age:Int =18) {

    constructor(email:String):this(){
        this.email = email;
    }

    var email:String="";
    fun action() {
        val message = "It's going to approve";
        println(message);
    }
}

fun main(){
    val student1 = Student("rafael.rosales@utvtol.edu.mx");
    student1.action()
    println("Name: ${student1.name}, age:${student1.age}, email: ${student1.email}");

    val student2 = Student("Luis",23);
    println("Name: ${student2.name}, age: ${student2.age}");

}