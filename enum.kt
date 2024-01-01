/*
* enum class - creates a data type with a specified(limited) set of values
*
* enum class enumName {
*   Case1, Case2,Case3
* }
*
* enumName.case name
* */

enum class Difficulty {
    EASY, MEDIUM, HARD
}



class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)


fun main(){
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    println(question1.toString())


}

