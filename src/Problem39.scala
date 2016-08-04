/**
  * Created by varsha on 8/4/16.
  */
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
