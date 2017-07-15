import org.specs2.mutable.Specification

object LogicSpec extends Specification {
       "The'assertnumber' method" should {
       "be equal to 20" in {
       val b = Multiplication(4, 5)
       val c = Resultat(b.a * b.b)
       val result = maine.assertnumber(c.a)
       result shouldEqual (true)
       }
      }
       

}