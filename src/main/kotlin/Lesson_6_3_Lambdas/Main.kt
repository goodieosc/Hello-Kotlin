package Lesson_6_3_Lambdas

import kotlin.contracts.Returns

enum class Directions{
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game(){

    var path = mutableListOf<Directions>(Directions.START)
    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    val end = {
        path.add(Directions.END)
        println("GAME OVER")
        println(Game().path.toString())
        path.clear()
        false
    }

    fun move(where: () -> Boolean ) {
        where.invoke()
    }

    fun makeMove(command:String?) {
        if (command.equals("n")) move(north)
        else if (command.equals("s")) move(south)
        else if (command.equals("e")) move(east)
        else if (command.equals("w")) move(west)
        else move(end)
    }
}

fun main(args: Array<String>) {

    /*val game1 = Game()
    println(game1.path)
    game1.north()
    game1.east()
    game1.south()
    game1.west()
    game1.end()
    println(game1.path)*/

    val game = Game()

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }

}