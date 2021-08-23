fun main(args: Array<String>) {

    getFortuneCookie(getBirthday())
}


fun getBirthday() : Int {

    print("Enter your birthday (DD): ")

    val birthday = readLine()?.toIntOrNull()  ?: 1
    return birthday
}

fun getFortuneCookie(date: Int) : String {

    val fortune = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    //println(date)

    val cookie = when (date){
        in 1..15 -> 0
        16 -> 1
        17 -> 2
        18 -> 3

        else -> 5
    }



    return fortune[cookie]

}