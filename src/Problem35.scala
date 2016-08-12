/**
  * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

    There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

    How many circular primes are there below one million?
  */
object Problem35 {
  def main(args: Array[String]) {
    def isPrime(n: Long): Boolean = {
      (2L to math.sqrt(n).toLong).filter(n % _ ==0).toList.size <= 0
    }
    def isCircularPrime(n: String): Boolean = {
      var temp = n
      var i = 1
      var count = 0
      while(i < n.size) {
       temp = temp.drop(1) + temp.take(1)
        i = i + 1
        if(isPrime(temp.toLong))
          count = count + 1
      }
      if(count == n.size - 1)
        true
      else false
    }
    val solution = (100L until 1000000L).filter(isPrime(_)).count(x  => isCircularPrime(x.toString)) + 13 //(circular primes below 100)
  }
}
