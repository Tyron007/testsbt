
case class Multiplication(a: Int, b:Int)
case class Resultat(a: Int)


object maine {
   def assertnumber(a: Int): Boolean = {
    val bool = a == 20 match {
       case true => true
       case false => false
       }
       bool
   }

   def main(array: Array[String]): Unit = {
   println("hello word from maine")
   val b = Multiplication(4,5)
   val c = Resultat(b.a * b.b)
   }
}