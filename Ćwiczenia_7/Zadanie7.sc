object Zadanie7 {
  def main(args: Array[String]) : Unit = {
    val items = Map("pepsi" -> 5.00, "litr diesla" -> 6.05, "inflacja" -> 7.00)

    println(searching[String, Double](items, "pepsi"))
    println(searching[String, Double](items, "cola"))
  }
  
  def searching[K,V](map : Map[K, V], key : K) : Any = {
    map.get(key).getOrElse("brak klucza")
  }
}
  