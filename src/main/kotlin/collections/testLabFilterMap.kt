package collections

fun main() {
    val subjectList = subjectList()

    //Crear dos variables de tipo Lambda para filtrar DEVELOPMENT y BUSINESS
    val developmentFilter: (Subject) -> Boolean = { subject -> subject.category == SubjectCategory.DEVELOPMENT }
    val businessFilter: (Subject) -> Boolean = { subject -> subject.category == SubjectCategory.BUSINESS }

    //Crear una función para filtrar elementos usando una variable de tipo lambda
    val developmentSubjects = filterSubjects(subjectList, developmentFilter)
    val businessSubjects = filterSubjects(subjectList, businessFilter)

    println("Development Subjects:")
    developmentSubjects.forEach { subject ->
        println("ID: ${subject.id}, Name: ${subject.name}, Category: ${subject.category}")
    }

    println("\nBusiness Subjects:")
    businessSubjects.forEach { subject ->
        println("ID: ${subject.id}, Name: ${subject.name}, Category: ${subject.category}")
    }

    //Crear una función para generar un listado de tipo String usando map
    val predicateFilterMap = generateSubjectListString(subjectList, developmentFilter)

    println("\nPredicate Filter Map:")
    predicateFilterMap.forEach { subjectString ->
        println(subjectString)
    }
}

fun filterSubjects(subjects: List<Subject>, predicate: (Subject) -> Boolean): List<Subject> {
    return subjects.filter(predicate)
}

fun generateSubjectListString(subjects: List<Subject>, predicate: (Subject) -> Boolean): List<String> {
    return subjects.filter(predicate).map { subject -> "${subject.id} - ${subject.name}" }
}