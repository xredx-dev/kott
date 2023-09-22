package collections

fun main():Unit {
    val inmutableList : List<String> = listOf("Hola ","Mundo");
    println(inmutableList.joinToString(""));

    var mutableList : MutableList<String> = inmutableList.toMutableList();
    mutableList.add(" UTVT");
    println(mutableList.joinToString(""));
}