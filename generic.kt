/*
* [Generic data type] - allows the creation of data types that can work with different data types
*
* class className <generic data type> (
*   properties
* )
*
* class classname <generic data type>(
*   val propertyName: generic data type
*   ...
* )
*
* creating an instance of the class :
*   val instanceName = className<generic data type>(parameters)
* */

class Q<Type>(
    val questionText: String,
    val answer: Type,
    val difficulty: String
)

fun main(){
    val question1 = Q<String>("What is my name?", "Sia", "easy")
    val question2 = Q<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = Q<Int>("How many days are there between full moons?", 28, "hard")

}
