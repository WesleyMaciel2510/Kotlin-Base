fun main() {
    val arrayExample = arrayOf(1, 2, 3, 4, 5)

    println("Array Example:")
    for (element in arrayExample) {
        print("$element ")
    }
    println()

    val arrayListExample = arrayListOf("apple", "banana", "orange")

    println("ArrayList Example:")
    for (element in arrayListExample) {
        print("$element ")
    }
    println()

    // Modifying ArrayList
    arrayListExample.add("grape")
    arrayListExample.remove("banana")

    println("Modified ArrayList:")
    for (element in arrayListExample) {
        print("$element ")
    }
    println()
}
