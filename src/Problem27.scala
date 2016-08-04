/**
  * Created by varsha on 8/4/16.
  */
object Problem27 {
  def main(args: Array[String]) {
    def isPrime(n: Int): Boolean = {
      (2 to math.sqrt(n).toInt).filter(n % _ ==0).toList.size <= 0
    }
    def isCircularPrime(n: Int): Boolean = {
      true
    }
     println((2 to 100).filter(isPrime(_)).filter(isCircularPrime(_)))
  }
}
