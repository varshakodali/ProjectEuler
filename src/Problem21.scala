/*  Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
    If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

    For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

    Evaluate the sum of all the amicable numbers under 10000.
*/

object Problem21 {
  def main(args: Array[String]) {
    def factorsum(n: Int) = {
      ((1 to math.sqrt(n).toInt).filter(x1 => n % x1 == 0).map(x2 => List(x2, n/x2)).flatten.distinct.sum) - n
    }
    val solution = (10 until 10000).filter(x1 => (10 until 9999).exists(x2 => factorsum(x2) == x1 && x2==factorsum(x1) && x1!=x2)).sum
  }
}
