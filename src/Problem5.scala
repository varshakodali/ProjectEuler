/*
  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

object Problem5 {
  def main(args: Array[String]) {
    def factors(x: Int): List[Int] = {
      val prime = (2 to math.sqrt(x).toInt).find(x % _ == 0)
      prime match {
        case Some(n) => n :: x :: factors(x/n)
        case None => List(x)
      }
    }
    val primes: List[Int]   = (2 to 20).filter(n => !(2 to math.sqrt(n).toInt).exists(e => n % e ==0)).toList
    val composite: List[Int] = (2 to 20).filter(n => (2 to math.sqrt(n).toInt).exists(e => n % e ==0)).toList
    val inter = composite.map(n => factors(n)).distinct
    val inter2 = primes.flatMap(e1 => primes.map(e2 => e1 * e2))
    println(primes)
    println(composite)
    println(inter)
    //println(inter.filter(e => !primes.contains(e)))
    println(composite.flatMap(e1 => primes.map(e2 => {if(e1 % e2 ==0) e1/e2 else 0} )).filter(e => !primes.contains(e)).distinct)
  }
}
// still working on it