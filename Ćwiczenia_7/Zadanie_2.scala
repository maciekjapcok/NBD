object Zadanie2 {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    
    
    println(headtotail(daysOfWeek))
    println(tailtohead(daysOfWeek))
  }
  
  def headtotail (days: List[String]) : String = {
    if(!days.tail.isEmpty)
      days.head + ", "+ headtotail(days.tail)
    else
      days.head
  }
  
  def tailtohead (days:List[String]): String = {
    if(!days.tail.isEmpty)
      tailtohead(days.tail) + ", " + days.head
    else
      days.head
  }
}