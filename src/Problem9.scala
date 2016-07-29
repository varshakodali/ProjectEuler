/*
  A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

  a2 + b2 = c2
  For example, 32 + 42 = 9 + 16 = 25 = 52.

  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  Find the product abc.
*/

import scala.util.control.Breaks

object Problem9 {
  def main(args: Array[String]) {
    val br = new Breaks
    br.breakable(
      for(b <- (1 until 1000); a <- (2 until b); c = 1000 - a -b)  {
        if((a * a + b * b == c * c) && (a + b + c ==1000)){
          val solution = a * b * c
          br.break()
        }
      }
    )
  }
}


