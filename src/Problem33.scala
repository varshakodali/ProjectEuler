/**
  * The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.
  **
  *We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
  **
  *There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.
  **
  *If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
**/

object Problem33 {
  def main(args: Array[String]) {

    case class Fraction(numerator: Int, denominator: Int)

    def gcd(a: Int,b: Int): Int = {
      if(b ==0) a else gcd(b, a%b)
    }

    def isCurious(n:String, d: String): Boolean= {
      val num = {
        if((n diff d).isEmpty) 1
        else (n diff d).toInt
      }
      val den = {
        if((d diff n).isEmpty) 1
        else (d diff n).toInt
      }
      if(n.toDouble/d.toInt == num.toDouble/den && (n diff d).size != 2) true
      else false
    }

    def solution = {
      var numerator_product = 1
      var denominator_product = 1
      val curious_fractions = ((11 to 99).filter(_ % 10 != 0).flatMap(n => (n + 1 to 99).filter(_ % 10 != 0).map(d => {
        if (isCurious(n.toString, d.toString)) Fraction(n, d)
        else Fraction(1, 1)
      })).distinct)
      for(i <- curious_fractions) {
        numerator_product = numerator_product * i.numerator
        denominator_product = denominator_product * i.denominator
      }
      denominator_product/gcd(numerator_product,denominator_product)
    }
  }
}
