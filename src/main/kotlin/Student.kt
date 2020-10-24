class Student(val name: String, val surname:String) {
    fun printStudent(){
        println("Imię: ${name}")
        println("Nazwisko: ${surname}")
    }

    override fun toString(): String {
        return "Student(name='$name', surname='$surname')"
    }

    fun createStudents():List<Student>?{

        return null
    }
}
