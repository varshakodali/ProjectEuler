/*
  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

  Find the sum of all the primes below two million.
*/
object Problem10 {

  def main(args: Array[String]) {
    val solution = (2L to 2000000L).filter(e => !(2L to math.sqrt(e).toLong).exists(x => e % x == 0)).sum
  }
}
