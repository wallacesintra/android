//
///*
//* Synchronous code - code that only one task is executed at a time.
//  One task must finish completely before the next one is started
//
//
//* delay:
//
//  import kotlinx.coroutine.*
//
//
//  suspend function ->
//  suspend fun spendFuncName() {
//    delay(2000)
//    println("After delay")
//  }
//
//* A suspension point is the place within the function where execution of the function can suspend.
//* */
//
//
//import kotlinx.coroutines.*
//
//suspend fun printLater(){
//    delay(600)
//    println("After 6 seconds")
//}
//
//suspend fun printMoreLater(){
//    delay(1200)
//    println("After 12 seconds")
//}
//
//fun main(){
//    runBlocking{
//        println("Test Delay")
//        printLater()
//        printMoreLater()
//    }
//}
///*
//* Asynchronous
//*
//* launch() - to launch new coroutine
//* */
//
//
