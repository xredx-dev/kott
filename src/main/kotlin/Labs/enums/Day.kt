package Labs.enums

fun main() {
    var currentDay = WeekDay.LUNES

    println("Día actual: $currentDay")
    currentDay = currentDay.nextDay()
    println("Día siguiente: $currentDay")
    currentDay = currentDay.nextDay()
    println("Día siguiente: $currentDay")
    currentDay = currentDay.nextDay()
    println("Día siguiente: $currentDay")
    currentDay = currentDay.nextDay()
    println("Día siguiente: $currentDay")
    currentDay = currentDay.nextDay()
    println("Día siguiente: $currentDay")
    currentDay = currentDay.nextDay()
    println("Día siguiente: $currentDay")
}
