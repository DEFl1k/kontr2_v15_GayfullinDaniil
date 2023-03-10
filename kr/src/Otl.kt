class Otl(name:String, pred:String, ocenka:Int, chislo:Int) :Student(name,pred,ocenka,chislo) {
    fun otl(): String{
       if(ocenka<3)
       {
           return "Экзамен был не сдан"
       }
        else{
            return "Экзамен был успешно сдан"
       }
    }
    fun mo(): String {
        if(chislo>0)
        {
            return "Сейчас идёт начало месяца"
        }
        else{
            return "Сейчас идёт конец месяца"
        }
    }
}