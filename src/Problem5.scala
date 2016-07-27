/*
  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

object Problem5 {
  def main(args: Array[String]) {
    val  solution = (20 to Int.MaxValue).filter(n => (2 to 20).forall(n % _ == 0 )).min
  }
}
