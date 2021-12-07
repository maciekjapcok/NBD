object Zadanie2 {
  def main(args: Array[String]) : Unit = {
    
    val konto1 = new KontoBankowe(500)
    println(konto1.stanKonta)
    
    val konto2 = new KontoBankowe()
    println(konto2.stanKonta)
    println("Wplata: "+ konto2.wplata(20))
    println(konto2.stanKonta)
    println("Wyplata: " + konto2.wyplata(10))
    println(konto2.stanKonta)
  }
  
  class KontoBankowe(private var _stanKonta: Double) {
    def this()= {
      this(0)
    }
    
    def stanKonta : Double = _stanKonta
    
    def wplata(kwota: Double) : Double = {
      _stanKonta = _stanKonta + kwota
      _stanKonta
    }

    def wyplata(kwota: Double) : Double = {
      _stanKonta = _stanKonta - kwota
      _stanKonta
    }
  }  
}
  
      
    
    
    
    
