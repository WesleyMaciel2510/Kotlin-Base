fun main() {
    // Nullable types
    var nullableString: String? = "Kotlin"
    // nullableString = null // Uncomment this line to see the effect of null assignment

    // Safe calls (?.) and the Elvis operator (?:)
    val length: Int = if (nullableString != null) {
        nullableString.length
    } else {
        -1
    }
    println("Length of the string (safe call): $length")

    // Using safe call operator (?.)
    val safeLength: Int? = nullableString?.length
    println("Safe Length of the string: $safeLength")

    // Using the Elvis operator (?:)
    val lengthOrZero: Int = nullableString?.length ?: 0
    println("Length of the string or zero: $lengthOrZero")

    // Example with a non-nullable variable
    val nonNullableString: String = nullableString ?: "Default"
    println("Non-nullable string: $nonNullableString")
}
