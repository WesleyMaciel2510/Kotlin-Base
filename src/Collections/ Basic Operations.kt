fun main() {
    // List operations
    val numbersList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println("Original Numbers List: $numbersList")

    numbersList.add(6)
    numbersList.removeAt(1)
    println("Modified Numbers List: $numbersList")

    // Set operations
    val uniqueNumbers: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    println("\nOriginal Unique Numbers Set: $uniqueNumbers")

    uniqueNumbers.add(6)
    uniqueNumbers.remove(3)
    println("Modified Unique Numbers Set: $uniqueNumbers")

    // Map operations
    val personInfo: MutableMap<String, Any> = mutableMapOf(
        "name" to "Charlie",
        "age" to 28,
        "isStudent" to false
    )
    println("\nOriginal Person Information Map: $personInfo")

    personInfo["isStudent"] = true
    personInfo["location"] = "City A"
    println("Modified Person Information Map: $personInfo")
}
