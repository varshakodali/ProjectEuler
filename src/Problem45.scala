/**
  * Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:
  **
  *Triangle	 	Tn=n(n+1)/2	 	 1, 3, 6, 10, 15, ...
  *Pentagonal	Pn=n(3n−1)/2	 1, 5, 12, 22, 35, ...
  *Hexagonal	 	Hn=n(2n−1)	 	 1, 6, 15, 28, 45, ...
  *It can be verified that T285 = P165 = H143 = 40755.
  **
  *Find the next triangle number that is also pentagonal and hexagonal.
  */

object Problem45 {
  def main(args: Array[String]) {

    val pentagonal = Stream.from(30000).map(n => n.toLong * (3 * n - 1) / 2).take(10000)
    val hexagonal = Stream.from(20000).map(n => n.toLong * (2 * n - 1)).take(10000)
    val solution = Stream.from(50000).map(n => n.toLong * (n + 1) / 2).find(x => pentagonal.contains(x) && hexagonal.contains(x))
  }
}