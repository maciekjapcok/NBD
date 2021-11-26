object Zadanie8 {
  def main(args: Array[String]) : Unit = {
    val nums = List(1, 2, 0, 3, 7, 158, 0, 0, 28, 123, 0)

    println(zeros(nums))
  }
  
  def zeros(list: List[Int], acc: List[Int] = List.empty): List[Int] = {
    list match {
       case Nil => acc
       case 0::tail => zeros(tail, acc)
       case head::tail => zeros(tail, acc:+head)
    }
  }
}
  