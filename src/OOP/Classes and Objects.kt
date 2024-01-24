class Car(val brand: String, val model: String) {
    // Member function
    fun start() {
        println("$brand $model is starting.")
    }
}

fun main() {
    // Object instantiation
    val myCar = Car("Toyota", "Camry")

    // Accessing properties and calling member functions
    println("My car is a ${myCar.brand} ${myCar.model}.")
    myCar.start()
}
