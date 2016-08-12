/**
  * The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

    Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

  * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
*/
object Problem37 {
  def main(args: Array[String]) {

    def isPrime(n: Int): Boolean = {
      (2L to math.sqrt(n).toLong).filter(n % _ ==0).toList.size <= 0
    }

    def isTruncatablePrime(n: String)  = {
      var i = 1
      var count = 0
      var temp = n
      while(i < n.size){
        if(n.take(i).toInt != 1 && n.drop(i).toInt != 1 && isPrime(n.take(i).toInt) && isPrime(n.drop(i).toInt) ) {
          count = count + 1
        }
        i = i + 1
      }
      if(count == n.size - 1) true
      else false
    }
    val solution = (10 until 1000000).filter(n => isPrime(n) && isTruncatablePrime(n.toString)).sum
  }
}
