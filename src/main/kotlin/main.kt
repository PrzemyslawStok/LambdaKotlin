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

    printResult2(2,2){a,b->a*a+b*b}
    printResult2(2,5){a,b->a*b+2}

    val student = Student("Przemysław","Stokłosa")
    var student1:Student? = null
    student.printStudent()
    println(student)
    println(student1)
    student1 = Student("Przemysław1","Stokłosa1")
    println(student1)

    println(student.createStudents(5,"Przemysław","Stokłosa"){"${it*it}"})

    val g:(Int,String)->String = {a,b->"$b: ${a*a}"}
    println(g(10,"Wynik działania"))

    val array1 = IntArray(10){
        val value = it*it
        println("Zainicjalizowano element: $value")
        value
    }
    println(array1.asList())
}

fun sub1(a:Int,b:Int):Int{
    return a-b
}

fun printResult(a:Int,f:(Int)->Int){
    println("Wynikiem działania jest ${f(a)}")
}

fun printResult2(a:Int,b:Int,f:(Int,Int)->Int){
    println("Wynikiem działania jest ${f(a,b)}")
}

fun example(){
    val f:(Int,Int,Double)->String = {
            a:Int,b:Int,c:Double->
        println("Przykładowy napis")
        "$a $b $c"
    }

    println(f(1,2,5.0))
}
