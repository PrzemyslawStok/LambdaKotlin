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
}

fun sub1(a:Int,b:Int):Int{
    return a-b
}
