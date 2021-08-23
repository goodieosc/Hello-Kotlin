import java.lang.Math.random

fun main(args: Array<String>) {

    val rollDice ={numberOfSides: Int -> (1..numberOfSides).random()}
    //val rollDice2 ={numberOfSides: Int -> (1..numberOfSides).random()}

    //repeat(20) {
    //    println(rollDice(8))

   // }

   // repeat(20) {
    //    println(rollDice2(3))

   // }

    repeat(20) {
        gamePlay((1..10).random())


    }

    gamePlay(rollDice(4).toInt())

}


fun gamePlay(result: Int){
    println(result.toString())

}
