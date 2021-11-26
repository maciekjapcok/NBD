object Zadaniea {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(forloop(daysOfWeek))
    println(forloopP(daysOfWeek))
    println(whileloop(daysOfWeek))
  }
  
  def forloop(days: List[String]) : String = {
    var result = ""
    var i = 0
    
    for(x <- days) {
      if(i == 0) 
        result = x
      else
        result = result + ", " + x
      
      i = i + 1
    }
    
    result
  }
  
  def forloopP(days: List[String]) : String = {
    var result = ""
    var i = 0
    
    for(x <- days.filter(_.toUpperCase().startsWith("P"))) {
      if(i == 0) 
        result = x
      else
        result = result + ", " + x  
      
      i = i + 1
    }
    
    result
  }
  
  def whileloop(days: List[String]) : String = {
    val elems = days.length;
    var i = 0;
    var result = ""
    
    while (i < elems) {
      if(i == 0) 
        result = days(i)
      else
        result = result + ", " + days(i)  
      i = i+1
    }
    
    result
  }
}
    


  

