package collections

fun subjectList():MutableList<Subject> {
    var list = mutableListOf<Subject>();
    list.add(Subject(1,"PWA",SubjectCategory.CLOUD));
    list.add(Subject(1,"Gestion del proceso de desarrollo de software",SubjectCategory.DEVELOPMENT));
    list.add(Subject(2,"Desarrollo Movil Integral",SubjectCategory.DEVELOPMENT));
    list.add(Subject(3,"Integradora",SubjectCategory.BUSINESS));
    list.add(Subject(3,"Negociacion empresarial",SubjectCategory.HUMAN_RESOURSES));
    list.add(Subject(3,"Ingles IX",SubjectCategory.SOFT_SKILLS));
    return list;
};