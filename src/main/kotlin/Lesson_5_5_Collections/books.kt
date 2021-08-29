package Lesson_5_5_Collections

fun main(args: Array<String>) {

    val allBooks = setOf("The Tempest","The Two Gentlemen of Verona",
        "The Merry Wives of Windsor","Measure for Measure","The Comedy of Errors","Hamlet")

    val library = mapOf("William Shakespeare" to allBooks)

    println(library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf("The Twits" to "Roald Daryl")

    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)




}