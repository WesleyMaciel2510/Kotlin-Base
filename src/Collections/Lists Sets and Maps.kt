fun main() {
    // Lists
    val numbersList: List<Int> = listOf(1, 2, 3, 4, 5)
    println("Numbers List: $numbersList")

    // Sets
    val uniqueNumbers: Set<Int> = setOf(1, 2, 3, 4, 5, 1, 2) // Duplicates are automatically removed
    println("Unique Numbers Set: $uniqueNumbers")

    // Maps
    val personInfo: Map<String, Any> = mapOf(
        "name" to "Alice",
        "age" to 30,
        "isStudent" to false
    )
    println("Person Information Map: $personInfo")
}
