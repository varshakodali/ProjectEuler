/**
  * Pentagonal numbers are generated by the formula, Pn=n(3n−1)/2. The first ten pentagonal numbers are:
  **
  *1, 5, 12, 22, 35, 51, 70, 92, 117, 145, ...
  **
  *It can be seen that P4 + P7 = 22 + 70 = 92 = P8. However, their difference, 70 − 22 = 48, is not pentagonal.
  **
  *Find the pair of pentagonal numbers, Pj and Pk, for which their sum and difference are pentagonal and D = |Pk − Pj| is minimised; what is the value of D?
  */

object Problem44 {

  def main(args: Array[String]) {
    def solution = {
      val pentagonal = Stream.from(1).map(n => n * (3 * n - 1) / 2).take(5000)
      var outList = scala.collection.mutable.ListBuffer[Long]()
      for(x1 <- pentagonal; x2 <- pentagonal) {
        if(pentagonal.contains(x1+x2) && pentagonal.contains(x1-x2) && x1 > x2)
          outList += x1-x2
      }
      outList.min
    }
  }
}
