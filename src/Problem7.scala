/*
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

  What is the 10001st prime number?
*/

object Problem7 {
  def main(args: Array[String]) {
    val solution = (2 until 2000000).filter(e => !(2 to math.sqrt(e).toInt).exists(x => e % x == 0)).take(10001)(10000)
  }
}