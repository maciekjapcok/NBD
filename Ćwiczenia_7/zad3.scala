object Zadanie3 {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    
    
    println(rectail(daysOfWeek))
    
  }
  
  def rectail(days: List[String]) : String = {
    @tailrec
    def tailrecres(days: List[String], result: String) : String = {
      if(days.isEmpty)
        result
      else 
        tailrecres(days.tail, result + ", " + days.head)
    }
    
    tailrecres(days.tail, days.head)
  }
}
  