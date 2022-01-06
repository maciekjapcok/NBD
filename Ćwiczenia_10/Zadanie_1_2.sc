println("Zadanie_1")
println("")
def pairs: Iterator[(Int, Int)] = for {
  
  x <- Iterator.from(1)
  
  y <- 1 until x + 1 if x % y == 0
  
} yield (x, y)

val number = pairs.buffered
  println(number.next)
  pairs take 19 foreach println


println("\nZadanie_2")
println("")




def mapa(x: Double): Double = (x*2)
def flatmapa(x: Double): Maybe[Double] = Yes(x*2)


trait Maybe[+A] {

}




case class No() extends Maybe[Nothing] {
  def applyFunction[R](function: Nothing => R): Maybe[R] = No()
  def getOrElse(param : Any) = param 

  def map[R](function: Nothing => R): Maybe[R] = No()
  def flatMap[R](function: Nothing => Maybe[R]): Maybe[R] = No()
}






case class Yes[A](val value: A) extends Maybe[A]
{
  def applyFunction[R](function: A => R): Maybe[R] = Yes(function(value))
  def getOrElse(param : Any) = value
  
  def map[R](function: A => R): Maybe[R] = Yes(function(value))
  def flatMap[R](function: A => Maybe[R]): Maybe[R] = function(value)
}



val no = No()
val yes = Yes(123.5)

println(no.map(mapa))
println(yes.map(mapa))
println(yes.flatMap(flatmapa))
    
    
    
