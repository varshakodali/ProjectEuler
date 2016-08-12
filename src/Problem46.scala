/**
  * It was proposed by Christian Goldbach that every odd composite number can be written as the sum of a prime and twice a square.

    9 = 7 + 2×12
    15 = 7 + 2×22
    21 = 3 + 2×32
    25 = 7 + 2×32
    27 = 19 + 2×22
    33 = 31 + 2×12

    It turns out that the conjecture was false.

    What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?
  */

object Problem46 {
  def main(args: Array[String]) {

    def isPrime(n: Long): Boolean = {
      (2L to math.sqrt(n).toLong).filter(n % _ == 0).toList.size <= 0
    }

    def solution = {
      var outList = scala.collection.mutable.ListBuffer[Long]()
      val squares = Stream.from(1).map(n => n*n).take(1000).toList
      val primes = Stream.from(3).filter(n => isPrime(n)).take(1000).toList
      for(i <- primes; j <- squares)
        outList += (i + 2 * j)
      ((2 to 9999).filter(n => !isPrime(n) && n%2!=0) diff outList.filter(n => n%2!=0 && !isPrime(n))).min
    }
  }
}
