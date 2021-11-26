object Zadanie6 {
  def main(args: Array[String]) : Unit = {
    val tuple = ("string", 1337, false)
    show(tuple)
  }
  
  def show(tuple : Tuple3[String, Int, Boolean]) : Unit = {
    println(tuple._1 + ", " + tuple._2 + ", " + tuple._3)
  }
}
  