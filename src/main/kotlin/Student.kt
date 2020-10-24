class Student(val name: String, val surname:String) {
    fun printStudent(){
        println("Imię: ${name}")
        println("Nazwisko: ${surname}")
    }

    override fun toString(): String {
        return "Student(name='$name', surname='$surname')"
    }

    fun createStudents(n:Int,name:String,surname:String):ArrayList<Student>{
        val array:ArrayList<Student> = arrayListOf()

        for(i in 1..n){
            array.add(Student(name,surname))
        }

        return array
    }
}
