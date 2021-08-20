import utils.CalculateAreaUtils

class App {
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
            ======================================
            Enter Menu ? (1,2,3)
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
        println("Area of Rectangle = ${CalculateAreaUtils.calculateAreaRectangle(length, width)}")
    }

    private fun openMenuCircle() {
        print("Enter Radius = ")
        val radius = readLine().toString().toInt()
        println("Area of Circle = ${CalculateAreaUtils.calculateAreaCircle(radius)}")
    }

    private fun openMenuTriangle() {
        print("Enter Base = ")
        val base = readLine().toString().toInt()
        print("Enter Height = ")
        val height = readLine().toString().toInt()
        println("Area of Triangle = ${CalculateAreaUtils.calculateAreaTriangle(base,height)}")
    }
}