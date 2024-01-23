// InheritanceAndInterfacesExample.kt

// Base class (Superclass)
open class Shape(val name: String) {
    // Member function
    open fun draw() {
        println("Drawing $name")
    }
}

// Derived class (Subclass) inheriting from Shape
class Circle(radius: Double) : Shape("Circle") {
    // Additional property
    val radius: Double = radius

    // Overriding member function
    override fun draw() {
        println("Drawing $name with radius $radius")
    }
}

// Interface
interface Colorable {
    fun fill(color: String)
}

// Class implementing an interface
class ColoredCircle(radius: Double) : Shape("Circle"), Colorable {
    override fun draw() {
        super.draw()
        println("Now filling with color.")
    }

    override fun fill(color: String) {
        println("$name is filled with $color color.")
    }
}

fun main() {
    // Using inheritance
    val myCircle = Circle(5.0)
    myCircle.draw()

    // Using interfaces
    val coloredCircle = ColoredCircle(3.0)
    coloredCircle.draw()
    coloredCircle.fill("Blue")
}
