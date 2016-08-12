/**
  * An irrational decimal fraction is created by concatenating the positive integers:

    0.123456789101112131415161718192021...

    It can be seen that the 12th digit of the fractional part is 1.

    If dn represents the nth digit of the fractional part, find the value of the following expression.

    d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
**/
object Problem40 {
  def main(args: Array[String]) {
    val str = Stream.from(1).take(1000000).toList.mkString("")
    val solution = List(1,10,100,1000,10000,100000,1000000).map(n => str.charAt(n - 1)).map(_.asDigit).product
  }
}
