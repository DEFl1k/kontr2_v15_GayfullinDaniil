import kotlinx.coroutines.*

fun main() {
    var student = Otl("Даниил","Математика",5,10)
    student.dan()
    GlobalScope.launch {
        delay(4000L)
        println(student.otl())
    }
    println(student.mo())
    runBlocking { delay(8000L) }
}