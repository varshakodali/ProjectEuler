/**
  * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

    1634 = 14 + 64 + 34 + 44
    8208 = 84 + 24 + 04 + 84
    9474 = 94 + 44 + 74 + 44
    As 1 = 14 is not a sum it is not included.

    The sum of these numbers is 1634 + 8208 + 9474 = 19316.

    Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
  */
object Problem30 {
  def main(args: Array[String]) {
    def power5(s : String)={
      s.map(_.asDigit).map(x => math.pow(x,5)).sum
    }
    val solution =  (100 to 1000000).filter(p => p == power5(p.toString)).sum
  }
}
