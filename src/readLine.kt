fun main(args: Array<String>) {
    println("Type the value of x:  ")
    val x = readLine()?.toInt()!!

    println("Type the value of y:  ")
    val y = readLine()?.toInt()!!
    val z = (x+y)

    println("Result = $z")
}
