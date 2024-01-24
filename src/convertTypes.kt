fun main() {
    // Numeric types
    val intValue: Int = 42
    val doubleValue: Double = intValue.toDouble()
    val floatValue: Float = doubleValue.toFloat()

    println("Int value: $intValue")
    println("Converted to Double: $doubleValue")
    println("Converted to Float: $floatValue")

    // Character to Int
    val charValue: Char = 'A'
    val intValueFromChar: Int = charValue.toInt()

    println("Char value: $charValue")
    println("Converted to Int: $intValueFromChar")

    // Boolean to String
    val booleanValue: Boolean = true
    val stringValueFromBoolean: String = booleanValue.toString()

    println("\nBoolean value: $booleanValue")
    println("Converted to String: $stringValueFromBoolean")
}
