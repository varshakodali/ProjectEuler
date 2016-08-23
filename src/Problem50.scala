/**
  * The prime 41, can be written as the sum of six consecutive primes:

    41 = 2 + 3 + 5 + 7 + 11 + 13
    This is the longest sum of consecutive primes that adds to a prime below one-hundred.

    The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

    Which prime, below one-million, can be written as the sum of the most consecutive primes?
  */

object Problem50 {
  def main(args: Array[String]) {

    def isPrime(n: Int): Boolean = {
      (2 to math.sqrt(n).toInt).filter(n % _ == 0).toList.size <= 0
    }
    var outList = scala.collection.mutable.ListBuffer[Int]()
    def primeLength(n: Int): Int = {
      val primes= Stream.from(2).filter(isPrime(_)).take(1000000).sorted
      for(i <- primes) {
        if(n == i)
          outList +=1
        else {
          outList += i
        }
      }
      outList.length
    }

    println(Stream.from(1000).filter(isPrime(_)).maxBy(primeLength(_)))
  }
}