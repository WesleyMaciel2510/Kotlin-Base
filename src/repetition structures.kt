fun main() {
    println("While Loop:")
    var i = 1
    while (i <= 5) {
        println("Iteration $i")
        i++
    }

    println("\nDo-While Loop:")
    var j = 1
    do {
        println("Iteration $j")
        j++
    } while (j <= 5)

    println("\nFor Loop:")
    for (k in 1..5) {
        println("Iteration $k")
    }

    println("\nFor Each Loop with Array:")
    val arrayExample = arrayOf("apple", "banana", "orange")
    for (fruit in arrayExample) {
        println("Fruit: $fruit")
    }

    println("\nFor Each Loop with ArrayList:")
    val arrayListExample = arrayListOf("apple", "banana", "orange")
    for (fruit in arrayListExample) {
        println("Fruit: $fruit")
    }
}
