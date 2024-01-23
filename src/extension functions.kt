class Dog(val name: String, val age: Int)

// Extension function for the Dog class
fun Dog.bark() {
    println("$name is barking!")
}

// Extension function with a parameter for the Dog class
fun Dog.fetch(item: String) {
    println("$name is fetching $item.")
}

fun main() {
    // Creating an instance of the existing class
    val myDog = Dog("Buddy", 3)

    // Using the extension functions
    myDog.bark()
    myDog.fetch("the ball")

    // Extension function on a standard type (String)
    val greeting = "Hello, Kotlin!"
    val reversedGreeting = greeting.reverse()
    println("Reversed Greeting: $reversedGreeting")
}

// Extension function for String class
fun String.reverse(): String {
    return this.reversed()
}
