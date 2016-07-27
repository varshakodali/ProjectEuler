/*
  A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

  Find the largest palindrome made from the product of two 3-digit numbers.
*/

object Problem4 {
  def main(args: Array[String]) {
    var solution = (100 to 999).flatMap(n1 => (100 to 999).map(_ * n1)).filter(n2 => n2.toString == n2.toString.reverse).max
  }
}
