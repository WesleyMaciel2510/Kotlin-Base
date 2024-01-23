fun main() {
    // Conditional statements: if, else if, and else
    val number = 15

    if (number > 0) {
        println("$number is a positive number.")
    } else if (number < 0) {
        println("$number is a negative number.")
    } else {
        println("$number is zero.")
    }

    // Looping structures: for and while
    println("Counting from 1 to 5 using a for loop:")
    for (i in 1..5) {
        println("i = $i")
    }

    println("\nCounting from 5 to 1 using a while loop:")
    var countdown = 5
    while (countdown > 0) {
        println("Countdown: $countdown")
        countdown--
    }
}
