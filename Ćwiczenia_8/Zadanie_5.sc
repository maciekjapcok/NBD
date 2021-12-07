object Zadanie5 {
  
  
  class Osoba(val imie: String, val nazwisko: String, private var _podatek: Double){
    def podatek: Double = _podatek
  }
  
  trait Student extends Osoba {
    override def podatek: Double = 0
  }
  
  trait Pracownik extends Osoba{
    var pensja: Double= 4000
    override def podatek: Double = 0.2*pensja
  }
  trait Nauczyciel extends Pracownik{
    override def podatek: Double = 0.1*pensja
  }
  
  def main(args: Array[String]): Unit= {
    
    val student = new Osoba("Maciek", "Jabłoński", 10) with Student
    println("Podatek studencki: " + student.podatek)
    
    println("--------------------------------------------------------------")
    
    val nauczyciel = new Osoba("Ktoś", "Jakiś", 10) with Nauczyciel
    nauczyciel.pensja = 3500
    println("Pensja nauczyciela: " + nauczyciel.pensja)
    println("Podatek nauczycielski: " + nauczyciel.podatek)
    
    println("--------------------------------------------------------------")
    
    val pracownik = new Osoba("Michał", "Michałowski", 10) with Pracownik
    pracownik.pensja = 5000
    println("Pensja pracownika: " + pracownik.pensja)
    println("Podatek pracowniczy: " + pracownik.podatek)
    
    println("--------------------------------------------------------------")
    
    val pracownikStudent = new Osoba("Jacek", "Jackowski", 10) with Pracownik with Student
    pracownikStudent.pensja = 2800
    println("Pensja pracownika-studenta: " + pracownikStudent.pensja)
    println("Podatek pracowniczo-studencki: " + pracownikStudent.podatek)
    
    println("--------------------------------------------------------------")
    
    val studentPracownik = new Osoba("Kamil", "Kamilowski", 10) with Student with Pracownik
    studentPracownik.pensja = 2800
    println("Pensja studenta-pracownika: " + studentPracownik.pensja)
    println("Podatek studencko-pracowniczy: " + studentPracownik.podatek)
    
  }
}
      
    
    
    
    
