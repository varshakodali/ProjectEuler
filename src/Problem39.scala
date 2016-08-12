/**
   If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

   {20,48,52}, {24,45,51}, {30,40,50}

   For which value of p ≤ 1000, is the number of solutions maximised?
**/

object Problem39 {
  def main(args: Array[String]) {
    def numSolutions(p: Int): Int = {
      var solutions = 0
      for(b <- (1 until p); a <- (2 until b); c = p - a -b)  {
        if((a * a + b * b == c * c) && (a + b + c == p)){
          solutions += 1
        }
      }
      solutions
    }
    var solution = (12 to 1000).maxBy(x => numSolutions(x))
  }
}
