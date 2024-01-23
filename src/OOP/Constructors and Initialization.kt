// ConstructorsAndInitializationExample.kt

// Class with primary constructor
class Person(val name: String, var age: Int) {
    // Secondary constructor
    constructor(name: String) : this(name, 0)

    // Member function
    fun speak() {
        println("Hello, my name is $name and I'm $age years old.")
    }
}

fun main() {
    // Creating objects with different constructors
    val person1 = Person("Alice", 25)
    val person2 = Person("Bob")

    // Accessing properties and calling member functions
    person1.speak()
    person2.speak()
}
