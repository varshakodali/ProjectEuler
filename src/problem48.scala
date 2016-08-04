/**
  * The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

    Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
  */

object problem48 {
  def main(args: Array[String]) {
    val sum = (1 to 1000).map(n => BigInt(n).pow(n)).sum.toString
    val solution = sum.substring(sum.length - 10,sum.length)
  }
}
