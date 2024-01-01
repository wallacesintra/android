/*
* data class - class that only contain data, no actions
*
* data class className(...)
*
* data class needs to have at least one parameter in its constructor,
* and all constructor parameters must be marked with val or var.
* A data class also cannot be abstract, open, sealed, or inner.
*
*
* methods that can be implemented in a data class:
    equals()
    hashCode(): you'll see this method when working with certain collection types.
    toString()
    componentN(): component1(), component2(), etc.
    copy()
*
* */

enum class Level {
    EASY, MEDIUM, HARD
}

data class QuestionClass<T>(
    val questionText: String,
    val answer: T,
    val level: Level
)

fun main(){
    val quiz1 = QuestionClass<String>("Quoth the raven ___", "nevermore", Level.MEDIUM)
    println(quiz1.toString())
}
