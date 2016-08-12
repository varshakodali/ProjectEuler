/**
  * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

    The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

    Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

    HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
**/

object Problem32 {

  def main(args: Array[String]) {
    def isPandigital(s: String): Boolean = {
      (1 to 9).forall(x => s.map(_.asDigit).contains(x))
    }
    var outList = scala.collection.mutable.ListBuffer[Long]()
    for (x1 <- (1L to 9999L); x2 <- (1L to 999L)) {
      if (isPandigital(x1.toString + x2.toString + (x1 * x2).toString) && (x1.toString + x2.toString + (x1 * x2).toString).length == 9) {
        outList += x1 * x2
      }
    }
    val solution = outList.distinct.sum
  }
}
