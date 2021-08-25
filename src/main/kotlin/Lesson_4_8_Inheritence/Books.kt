package Lesson_4_8_Inheritence

open class Books (val title: String, val author: String) {

    open var currentPage: Int = 0

    open fun readpage() {
        currentPage += 1
        println(currentPage)
    }

}

class eBook(title: String, author: String, var format: String = "text") : Books(title,author) {

    var wordCount: Int = 0

    override fun readpage() {
        wordCount += 250
        println(wordCount)

    }


}
