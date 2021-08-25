package shape

class Triangle(val base: Int, val height: Int, val hypotenusa: Int) : Shape() {
    init {
        shapeName = "Triangle"
    }

    override fun calculateArea(): Double {
        return 0.5 * base * height
    }

    override fun calculateCircular(): Double {
        return (base + height + hypotenusa).toDouble()
    }
}