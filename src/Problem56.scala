/**
  A googol (10100) is a massive number: one followed by one-hundred zeros; 100100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.

  Considering natural numbers of the form, ab, where a, b < 100, what is the maximum digital sum?
 **/

object Problem56 {
  def main(args: Array[String]) {
    def sumOfDigits(s: String): Int = {
      s.map(_.asDigit).sum
    }
    val solution = (11 until 100).flatMap(a => (11 until 100).map(b => BigInt(a).pow(b).toString)).map(sumOfDigits(_)).max
  }
}
