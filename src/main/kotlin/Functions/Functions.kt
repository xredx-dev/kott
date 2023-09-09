package functions

import Functions.topLevelDivision
import Functions.topLevelMultiplication
import Functions.topLevelSubstraction
import  java.time.LocalDate;

fun printName(name:String){
    println("This is $name")
}

fun additions(x:Int, y:Int):Int{
    return x+y
}

fun printPerson(
    name: String,
    email:String = "",
    birthDate: LocalDate = LocalDate.now()
){
    println("Name is $name and the email is $email and birth date is $birthDate")
}
fun main() {
    val unit = printName("Rafael")
    println("Unit is $unit");

    val res = additions(1,2);
    println("Result is $res");
    printPerson("Rafael","al222010075@gmail.com", LocalDate.parse("1993-03-04"));

    val resultsub = topLevelSubstraction(5,4);
    println("TopLevelSubstraction: $resultsub");

    val resultmul = topLevelMultiplication(5,4);
    println("TopLevelMultipication: $resultmul");

    val resultdiv = topLevelDivision(5,4);
    println("TopLevelDivision: $resultdiv");
}