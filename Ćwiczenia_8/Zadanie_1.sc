object zad1{
  val week = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek")
  val free = List("Sobota", "Niedziela")
  
  
  def main(args: Array[String]) : Unit = {
    
    println(checking("Sobota"))
    println(checking("Wtorek"))
    println(checking("Sobota"))
    println(checking("blabla"))
    
  }
  
  
  def checking(str : String) : String = {
    str match{
      case x if (week.contains(x)) => "Praca"
      case y if (free.contains(y)) => "Weekend"
      case z => "Nie ma takiego dnia"
    }
  }
}