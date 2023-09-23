fun raiseException(): Nothing {
    throw RuntimeException("Text mustn't be null")
}

fun textLength(text: String?): Int {
    //val result:Int =when(text){
    //    null -> raiseException()
    //    else -> text.length
    //}
    //return result;
    try {
        val result: Int = when (text) {
            null -> raiseException()
            else -> text.length
        }
        return result
    } catch (e: RuntimeException) {
        println("Se ha producido una excepción: ${e.message}")
        return -1
    }
}

fun main() {
    val nullText: String? = null
    val nonNullText: String = "Hi there"

    println("Text Length is ${textLength(nonNullText)}")
    println("Text Length is ${textLength(nullText)}")
}
