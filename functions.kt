fun main() {
    val trickFun = trick
    trickFun()
    treat()

}

// function stored in a variable
val trick = {
    println("No treat!")
}

//functions return type
/*
* (paramters (optional)) -> return type
* val functionName: () -> returnType = {}
*
* fun functionName(): functionType {
*   code..
*   return ..
* }
* */

val treat: () -> Unit = { // Unit used when a function does not return anything
    println("Treat")
}
