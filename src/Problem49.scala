/**
  * The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways: (i) each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another.
  *
  * There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property, but there is one other 4-digit increasing sequence.
  *
  * What 12-digit number do you form by concatenating the three terms in this sequence?
  *
**/

import scala.util.control.Breaks

object Problem49 {
  def main(args: Array[String]) {

    def isPrime(n: Int): Boolean = {
      (2 to math.sqrt(n).toInt).filter(n % _ == 0).toList.size <= 0
    }

    def yes(n : Int): Int = {

      val perm = n.toString.permutations.map(_.toInt).toList
      val b = new Breaks
      var diff = 0
      b.breakable(
        for(i <- ( 1000 to 3500)) {
          if(perm.contains(n + i) && perm.contains(n + (2*i)) && isPrime(n +i) && isPrime(n + 2* i)) {
            diff = i
            b.break()
          }
        }
      )
      diff
    }

    val value: List[Int] = (1488 to 9999).map(n => {
      val diff = yes(n)
      if(isPrime(n) && diff!=0)
        List(n,diff)
      else List(0)
    }).filter(!_.contains(0)).flatten.toList

    val solution = value(0).toString + (value(0) + value(1)).toString + (value(0) + 2 * value(1)).toString
  }
}
