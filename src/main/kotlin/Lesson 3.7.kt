
fun main(args: Array<String>) {

var bd: String

    //for (i in 1..10) {

    var fortune: String = ""
    while (!fortune.contains("Take it easy")) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")

    }

    println("Your fortune is: ${getFortuneCookie()}")




}

private fun getFortuneCookie() : String {

    val list = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    print("Enter your birthday (DDMMYY): ")

    var birthday = readLine()?.toIntOrNull()  ?: 1

    println(birthday)

    return list[birthday.rem(list.size)]




}