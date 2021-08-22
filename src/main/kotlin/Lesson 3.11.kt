fun main(args: Array<String>) {

    println("Will more fish fit: ${fitMoreFish(10.0, listOf(3,3,4),2,false)}")

}

fun fitMoreFish(
    tankSize : Double,
    currentFish : List<Int>,
    fishSize : Int = 2,
    hasDecorations : Boolean = true
) : Boolean {

     var sizeTankNeeded : Double = currentFish.sum().toDouble() * fishSize
    println(sizeTankNeeded)

     if (hasDecorations) sizeTankNeeded = sizeTankNeeded * .8

    println(sizeTankNeeded)

    return sizeTankNeeded <= tankSize
}