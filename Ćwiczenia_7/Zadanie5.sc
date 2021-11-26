object Zadanie5 {
  def main(args: Array[String]) : Unit = {
    val items = Map("pepsi" -> 5.00, "litr diesla" -> 6.05, "inflacja" -> 7.00)
    
    val itemsdisc = disc(items);
    println(itemsdisc)
  }
  
  def disc(items: Map[String, Double]) : Map[String, Double] = {
    items.map(kv => (kv._1, 0.9*kv._2))
  }
}
  