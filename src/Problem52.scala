/**
  * It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.

    Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
  */

object Problem52 {
  def main(args: Array[String]) {

    def sameDigits(x: Int): Boolean = {
      val temp = x.toString.sorted
        if (temp == (2*x).toString.sorted && temp == (3*x).toString.sorted && temp == (4*x).toString.sorted && temp == (5*x).toString.sorted && temp == (6*x).toString.sorted) true
        else false
    }
    val solution = Stream.from(11).find(sameDigits(_))
  }
}
