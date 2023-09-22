package Labs

fun main() {

    val mutableClassmates: MutableList<String> = mutableListOf("Luis", "Fernando", "Daniel")

    val immutableClassmates: List<String> = mutableClassmates.toList()

    for (classmate in immutableClassmates) {
        println(classmate)
    }
}

