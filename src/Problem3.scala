/*
  The prime factors of 13195 are 5, 7, 13 and 29.

  What is the largest prime factor of the number 600851475143 ?
*/

object Problem3 {
  def main(args: Array[String]) {

    def factors(n: Long): List[Long] = {
      (2L to math.sqrt(n).toLong).filter(n % _ ==0).toList
    }
    val solution = factors(600851475143L).filter(e => factors(e).size <=0).max
  }
}
