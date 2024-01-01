/*
* singleton object - object of a class that only instantiate once
*
* object objectName {
*   body(properties, methods)
* }
*
* accessing:
*  objectName.propertyName
* */

object StudentProgress {
    var total: Int = 10
    var answer: Int = 3
}

fun main(){
    println("${StudentProgress.total}")
    println("${Quiz.answered} of ${Quiz.total} answered.")
    Quiz.printProgressBar()
    println(Quiz.progressText)


}


/*
* companion object - object defined inside a class
*
* companion object objectName
* */

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object Progress{
        var total: Int = 10
        var answered: Int = 7
    }
}

/*
* extension property
*
* val typeName.propertyName: data type
*
* */

val Quiz.Progress.progressText: String
    get() = "$answered of $total answered"

/*
* extension function
*
* fun typeName.functionName(parameters): return type {
*   function body
* }
* */

fun Quiz.Progress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}
