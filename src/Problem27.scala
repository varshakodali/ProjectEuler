/*  Euler discovered the remarkable quadratic formula:

    n*n + n + 41
    It turns out that the formula will produce 40 primes for the consecutive integer values 0≤n≤390≤n≤39. However, when n=40,402+40+41=40(40+1)+41n=40,402+40+41=40(40+1)+41 is divisible by 41, and certainly when n=41,412+41+41n=41,412+41+41 is clearly divisible by 41.

    The incredible formula n*n −79n + 1601 was discovered, which produces 80 primes for the consecutive values 0≤n≤79. The product of the coefficients, −79 and 1601, is −126479.

    Considering quadratics of the form:

    n*n + an + b, where |a|<1000 and |b|≤1000

    where |n| is the modulus/absolute value of n
    e.g. |11| = 11 and |−4| = 4
    Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with  n=0
*/

object Problem27 {
  def main(args: Array[String]) {
    def isPrime(n: Long): Boolean = {
      (2L to math.sqrt(n).toLong).filter(n % _ == 0).toList.size <= 0
    }
    def solution = {
      var ax = 0L
      var bx = 0L
      var size = 0L
      for (a <- (-1000L until 1000L); b <- (-1000L to 1000L)) {
        val primeCount = Stream.from(0).map(n => n * n + a * n + b).takeWhile(x => x > 0 && isPrime(x)).size
        if ( primeCount > size) {
          size = primeCount
          ax = a
          bx = b
        }
      }
      ax * bx
    }
  }
}