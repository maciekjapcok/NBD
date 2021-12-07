object Zadanie3 {
  
  def main(args: Array[String]) : Unit = {
    
    println(hello(new Osoba("Maciek", "Jabłoński")))
    println(hello(new Osoba("Robert", "Lewandowski")))
    println(hello(new Osoba("Kry", "Cha")))
    
  }
  
  case class Osoba(val imie: String, val nazwisko: String) {
    
  }
  
  def hello(osoba:Osoba) = osoba match {
    case Osoba("Maciek", "Jabłoński") => "Siema jestem Maciek"
    case Osoba("Robert", "Lewandowski") => "Hej to ja Robert, znowu bez złotej piłki"
    case x => "Witam"
  }
}
  
      
    
    
    
    
