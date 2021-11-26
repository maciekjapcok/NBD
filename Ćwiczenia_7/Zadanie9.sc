object Zadanie8 {
  def main(args: Array[String]) : Unit = {
    val nums = List(1, 2, 0, 3, 7, 158, 0, 0, 28, 123, 0)

    println(add(nums, 1))
  }
  
  def add(list: List[Int], incrementValue: Int) : List[Int] = {
    list.map(_ + incrementValue)
  }
}