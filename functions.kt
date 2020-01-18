import java.util.Calendar
import java.util.Date
fun main(){
    dayOfWeek()
}


fun dayOfWeek(){
    println("What day it is today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when(day){
        1->"Sunday"
        2->"Monday"
        3->"Tuesday"
        4->"Wednesday"
        5->"Thursday"
        6->"Friday"
        7->"Saturday"
        else->"Time has stopped"
    })
}