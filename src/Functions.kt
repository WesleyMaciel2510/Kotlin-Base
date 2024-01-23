// Function without parameters and without a return type
fun greet() {
    println("Hello, Kotlin!")
}

// Function with parameters and a return type
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

// Function with a default parameter value
fun greetUser(name: String = "Guest") {
    println("Hello, $name!")
}

fun main() {
    // Calling functions
    greet()

    val result = addNumbers(5, 3)
    println("Sum of 5 and 3 is: $result")

    greetUser() // Calling with default parameter
    greetUser("Alice") // Calling with a specific parameter value
}
