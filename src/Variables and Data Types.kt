fun main() {
    // var is mutable
    var age = 25
    age = 26
    val name: String = "wesley"
    //name = "batman"
    // Val cannot be reassigned

    // String
    val language: String = "Kotlin"
    println("Hello, $language!")

    // Int
    for (i in 1..5) {
        println("i = $i")
    }

    // Double
    val pi: Double = 3.14
    println("The value of pi is $pi")

    // Boolean
    val isKotlinAwesome: Boolean = true
    if (isKotlinAwesome) {
        println("Kotlin is awesome!")
    } else {
        println("Kotlin is not awesome?")
    }

    // Char
    val firstLetter: Char = 'K'
    println("The first letter of Kotlin is $firstLetter")

    // Short
    val shortNumber: Short = 100
    println("A short number: $shortNumber")

    // Long
    val longNumber: Long = 1000000000L
    println("A long number: $longNumber")

    // Byte
    val byteValue: Byte = 127
    println("A byte value: $byteValue")

    // Float
    val floatValue: Float = 3.14f
    println("A float value: $floatValue")
}
