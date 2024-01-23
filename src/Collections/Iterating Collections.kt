fun main() {
    // List iteration
    val fruits: List<String> = listOf("Apple", "Banana", "Orange")
    println("Fruits List:")
    for (fruit in fruits) {
        println(fruit)
    }

    // Set iteration
    val uniqueNumbers: Set<Int> = setOf(1, 2, 3, 4, 5)
    println("\nUnique Numbers Set:")
    for (number in uniqueNumbers) {
        println(number)
    }

    // Map iteration
    val personInfo: Map<String, Any> = mapOf(
        "name" to "Bob",
        "age" to 25,
        "isStudent" to true
    )
    println("\nPerson Information Map:")
    for ((key, value) in personInfo) {
        println("$key: $value")
    }
}
