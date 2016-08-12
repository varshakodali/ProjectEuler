/**
  * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

    What is the largest n-digit pandigital prime that exists?
  */

object Problem41 {

  def main(args: Array[String]) {

    def isPandigital(s: String, l: Int): Boolean = {
      (1 to l).forall(x => s.map(_.asDigit).contains(x))
    }
    def isPrime(n: Int): Boolean = {
      (2L to math.sqrt(n).toLong).filter(n % _ == 0).toList.size <= 0
    }
    val solution = (12 to 9999999).filter(x => isPandigital(x.toString,x.toString.length) && isPrime(x)).max
  }
}
