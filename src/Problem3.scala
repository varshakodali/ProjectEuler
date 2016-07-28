/*
  The prime factors of 13195 are 5, 7, 13 and 29.

  What is the largest prime factor of the number 600851475143 ?
*/

object Problem3 {
  def main(args: Array[String]) {
    def factors(n: Long) = {
      (2 to math.sqrt(n).toInt).filter(n % _ ==0)
    }
    factors(600851475143L).filter(e => !(2 to (math.sqrt(e).toInt)).exists(x => e % x == 0)).max
  }
}
