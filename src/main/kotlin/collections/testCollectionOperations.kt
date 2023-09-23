package collections

fun main() {
    val subjectList = subjectList()
    val resultFilter = subjectList.filter { x -> x.category == SubjectCategory.CLOUD }
    val resultMap = subjectList.map { c -> c.name.uppercase() }.toList()

    println("\nFiltered Result:")
    resultFilter.forEach { subject ->
        println("ID: ${subject.id}, Name: ${subject.name}, Category: ${subject.category}")
    }

    println("\nResult Map:")
    resultMap.forEachIndexed { index, name ->
        println(name)
    }
}

