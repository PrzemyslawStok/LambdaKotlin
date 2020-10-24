import kotlin.math.PI
import kotlin.math.sin

fun main(){
    val square = {a:Double->a*a}
    val square1: (Double)->Double = {a->a*a}
    val add = {a:Int,b:Int->a+b}

    val sub:(Int,Int)->Int = {a:Int,b:Int->a-b}

    println(square(5.0))
    println(add(2,5))

    val numbers = IntArray(10){a->a*a}
    val numbers1 = IntArray(5){it*it*it}


    println(numbers.asList())
    println(numbers1.asList())

    val square2 = {a:Int->a*a}
    printResult(5,square2)
    printResult(5,{a->a*a})
    printResult(5,{it*it})
    printResult(5){a->a*a}
    printResult(5){it*it}

}

fun sub1(a:Int,b:Int):Int{
    return a-b
}

fun printResult(a:Int,f:(Int)->Int){
    println("Wynikiem działania jest ${f(a)}")
}
