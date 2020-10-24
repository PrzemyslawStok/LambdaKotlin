fun main(){
    val square = {a:Double->a*a}
    val add = {a:Int,b:Int->a+b}

    val sub:(Int,Int)->Int = {a:Int,b:Int->a-b}

    println(square(5.0))
    println(add(2,5))
}

fun sub1(a:Int,b:Int):Int{
    return a-b
}
