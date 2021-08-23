fun main(args: Array<String>) {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    val currySorted = spices.filter { it.contains("curry", true) }.sortedBy { it.length }

    var filterOnCandE = spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }

    val firstThree = spices.take(3).filter { it.startsWith('c')}

    println(currySorted)
    println(filterOnCandE)
    println(firstThree)

}