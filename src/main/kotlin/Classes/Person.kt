package Classes

open class Person(
    val id:Int =0,
    val name:String = "Rafael",
    val status: Boolean = false
) {
    open fun isApproved():Boolean{
        return this.status;
    }
}