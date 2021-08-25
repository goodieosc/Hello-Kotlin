package Spices2

sealed class Spice (val name: String, val spiciness: String = "mild") {

    open fun prepareSpice() {}
}

class Curry(name: String, spiciness: String, spiceColor: YellowSpiceColor) : Spice(name, spiciness), Grinder{

    override fun grind() {}

    override fun prepareSpice(){
        grind()
    }

}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color: String = Color.YELLOW.toString()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF),YELLOW(0xFFFF00);
}



data class SpiceContainer(val label: String) {}