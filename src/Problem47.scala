/**
  * The first two consecutive numbers to have two distinct prime factors are:

    14 = 2 × 7
    15 = 3 × 5

    The first three consecutive numbers to have three distinct prime factors are:

    644 = 2² × 7 × 23
    645 = 3 × 5 × 43
    646 = 2 × 17 × 19.

    Find the first four consecutive integers to have four distinct prime factors. What is the first of these numbers?
  */
object Problem47 {
  def main(args: Array[String]) {

    def factors(x: Int): List[Int] = {
      val prime = (2 to math.sqrt(x).toInt).find(x % _ == 0)
      prime match {
        case Some(n) => n :: factors(x/n)
        case None => List(x)
      }
    }
    val solution = Stream.from(2).find(i => factors(i).distinct.size == 4 && factors(i+1).distinct.size == 4 && factors(i+2).distinct.size == 4 && factors(i+3).distinct.size == 4)
  }
}
