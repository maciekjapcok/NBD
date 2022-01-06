
class Container[A](x: A){
  def getContent() : A = x
  
  
  
  def applyFunction[R](function: A => R) : R = {
    function(getContent())
  }
}

val c1 = new Container(90);
println(c1.getContent())
println(c1.applyFunction((a: Int) => a + 10))

val c2 = new Container("NBD");
println(c1.getContent())
println(c2.applyFunction((a: String) => a+" NBDNBD"))


    
trait Maybe[+A] {

}

case class No() extends Maybe[Nothing] {
  def applyFunction[R](function: Nothing => R): Maybe[R] = No()
  def getOrElse(param : Any) = param 

}

case class Yes[A](val value: A) extends Maybe[A]
{
  def applyFunction[R](function: A => R): Maybe[R] = Yes(function(value))
  def getOrElse(param : Any) = value
}

println("\nZadanie_2")

val no = new No
println(no.isInstanceOf[Maybe[_]])
val yes = new Yes[String]("yes string")
println(yes.isInstanceOf[Maybe[_]])

println("\nZadanie_3")

println(no.applyFunction((value: String) => value))
println(yes.applyFunction((value: String) => value))

println("\nZadanie_4")

println(no.getOrElse("parametr getOrElse"))
println(yes.getOrElse("param getOrElse-Yes"))    
