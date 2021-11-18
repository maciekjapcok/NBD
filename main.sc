object Zad1 {
  def main(args: Array[String]): Unit = {
    val days = List(
      "Poniedziałek",
      "Wtorek",
      "Środa",
      "Czwartek",
      "Piątek",
      "Sobota",
      "Niedziela"
    )
    
    println(forloop(days))
    println("-" * 100)
    
    println(forloopPletter(days))
    println("-" * 100)
    
    println(whileloop(days))
    println("-" * 100)
    

  }
//podpunkt a - pętla for
  
  def forloop(list: List[String]): String = {
    var result = ""
    var i = 0

    for (day <- list) {
      if (i == 0)
        result = day
      else
        result = result + ", " + day

      i += 1
    }

    result

  }
//podpunkt b - pętla for dla nazw na literę "P"
  
  def forloopPletter(list: List[String]): String = {
    var result = ""
    var i = 0
    
    for(day <- list.filter(_.toUpperCase().startsWith("P"))){
      if (i==0)
        result = day
      else
        result = result + ", " + day
      
      i += 1
    }
    result
    }
//podpunkt c - pętla while 
  
  def whileloop(list: List[String]): String = {
    var result = ""
    var i = 0
    var elements = list.length
    
    while(elements > i){
      if(i==0)
        result = list(i)
      else
        result = result + ", " + list(i)
      
      i += 1
    }
    result
  }
}

