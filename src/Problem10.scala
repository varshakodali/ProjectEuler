/*
  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

  Find the sum of all the primes below two million.
*/
object Problem10 {

  def main(args: Array[String]) {
    val str = (2 to 2000000)
    println(str.filter(e => !(2 to math.sqrt(e).toInt).exists(x => e % x == 0)).sum)
  }
}
