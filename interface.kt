/*
* interface interfaceName {
*   interface body
* }
*
* class className: Interface Name {
*   class body
* }
* */

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}


class Quizz : ProgressPrintable {
    override val progressText: String
        get() = "$answered of $total answered"
    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object Progress{
        var total: Int = 10
        var answered: Int = 7
    }
}

fun main() {
    Quizz().printProgressBar()
}


