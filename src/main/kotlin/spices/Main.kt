package spices

fun main (args: Array<String>){

    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val spicelist = spices1.filter {it.heat < 5}

    println(spicelist)

    fun makeSalt() = Spice("Salt")

    println(makeSalt())


}








