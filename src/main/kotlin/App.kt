import shape.Circle
import shape.Rectangle
import shape.Shape
import shape.Triangle
import utils.StarGeneratorUtils

class App {

    private var starGeneratorUtils = StarGeneratorUtils()

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            App().start()
        }
    }

    private fun printHeader() {
        println(
            """
            ======================================
            Console App for Calculating Area in 2D
            ======================================
            1. Calculate Rectangle Area
            2. Calculate Circle Area
            3. Calculate Triangle Area
            4. Print Stars
            ======================================
            Enter Menu ? (1,2,3,4)
            ======================================
        """.trimIndent()
        )
    }

    private fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                openMenuRectangle()
            }
            "2" -> {
                openMenuCircle()
            }
            "3" -> {
                openMenuTriangle()
            }
            "4" -> {
                openMenuPrintStar()
            }
            else -> {
                println("No Menu Matches")
                print("\n")
                start()
            }
        }
    }

    fun start() {
        printHeader()

        // let will be executed if the input is not null
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun openMenuRectangle() {
        print("Enter Length = ")
        val length = readLine().toString().toInt()
        print("Enter Width = ")
        val width = readLine().toString().toInt()
        printShape(Rectangle(length, width))
    }

    private fun openMenuCircle() {
        print("Enter Radius = ")
        val radius = readLine().toString().toInt()
        printShape(Circle(radius))
    }

    private fun openMenuTriangle() {
        print("Enter Base = ")
        val base = readLine().toString().toInt()
        print("Enter Height = ")
        val height = readLine().toString().toInt()
        println("Enter Hypotenusa = ")
        val hypotenusa = readLine()?.toInt() ?: 0
        printShape(Triangle(base, height, hypotenusa))
    }

    private fun openMenuPrintStar() {
        println("Enter Total Star (max stars = 20) = ")
        val totalStar = readLine()?.toInt() ?: 0
        starGeneratorUtils.printStars(totalStar)
    }

    private fun printShape(shape: Shape) {
        shape.printShapeName()
        shape.calculateAreaAndCircular()
    }
}