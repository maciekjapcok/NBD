object Zadanie4 {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    
    
    println(foldl(daysOfWeek))
    println(foldr(daysOfWeek))
    println(foldlP(daysOfWeek))
  }
  
  def foldl(days: List[String]) : String = {
    days.tail.foldLeft(days.head)(_ + ", " + _)
  }
  
  def foldr(days: List[String]) : String = {
    days.dropRight(1).foldRight(days.last)(_ + ", " + _)
  }
  
  def foldlP(days: List[String]) : String = {
    days.filter(_.toUpperCase().startsWith("P")).tail.foldLeft(days.head)(_ + ", " + _)
  }
}
  