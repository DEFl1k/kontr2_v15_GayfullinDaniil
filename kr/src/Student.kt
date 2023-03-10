abstract class Student(var name:String, var pred:String,var ocenka:Int,var chislo:Int):Dan {

    override fun dan(){
        println(name + " получил " + ocenka + " по предмету " + pred)
        println("${chislo} числа")
    }
}