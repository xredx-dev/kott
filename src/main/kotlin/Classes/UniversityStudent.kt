package Classes

class UniversityStudent(id:Int,name:String,status:Boolean):Person(id,name,status) {
    override fun isApproved():Boolean{
        println("A university student has courses approved always");
        return  false;
    }
}