fun main(args: Array<String>) {


    print("Enter mood:")
    var mood = readLine().toString()

    print("Enter weather:")
    var weather = readLine().toString()

    print("Enter temp:")
    var temperature = readLine()?.toIntOrNull()

    println(whatShouldIDoToday(readLine()!!))

    println(temperature?.let { whatShouldIDoToday(mood, weather, it) })

}

fun whatShouldIDoToday(
    mood : String,
    weather : String = "Sunny",
    temperature : Int = 24
) : String {

    return when{
        walk(mood, weather) -> "go for a walk"
        bed(mood, weather, temperature) -> "stay in bed"
        temperature(temperature) -> "go swimming"

        else -> "Stay home and read."

    }



}

fun walk(mood : String, weather: String) : Boolean = mood == "happy" && weather == "Sunny"

fun bed(mood : String, weather: String, temperature : Int) : Boolean = mood == "sad" && weather == "rainy" && temperature == 0

fun temperature(temperature: Int) : Boolean = temperature > 35