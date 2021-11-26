object Zadanie8 {
  def main(args: Array[String]) : Unit = {
    val nums = List(-1.0, 2.0, 0.0, -3.0, -7.0, 158.0, 0.0, 0.0, -28.0, 12.0, 0.0)

    println(abs(nums))
  }
  
  def abs(list: List[Double]) : List[Double] = {
    val range : Double => Boolean = v => v >= -5.0 && v <= 12.0;
    
    list.filter(range).map(_.abs):::list.filter(!range(_))
  }
}