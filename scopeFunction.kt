/*
* Scope function - allows access to properties  & methods of an object without referring to its name.
*
* let() - allows one to refer to an object in a lambda expression using "it"(identifier) instead of the object name.
*
*
* */

class Test<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty

)


fun main(){
    val question1 = Test<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Test<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Test<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    val printQuiz1 = question1.let {
        println(it.questionText)
        println(it.answer)
        println(it.difficulty)
    }

    println(printQuiz1)

}
