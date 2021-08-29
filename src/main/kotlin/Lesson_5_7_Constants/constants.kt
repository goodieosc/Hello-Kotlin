package Lesson_5_7_Constants


const val maxBooks = 10

class Book(currentBooks: Int, newBooks: Int){

    fun canBorrow(currentBooks: Int, newBooks: Int): Boolean {
        return currentBooks + newBooks <= maxBooks
    }

    object Constants {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    fun printUrl(){
        println(Constants.BASE_URL + "Hamlet + .html")
    }


}

fun main(args: Array<String>) {

    val can = Book(5, 4)
    println(can.canBorrow(5,6))


}
