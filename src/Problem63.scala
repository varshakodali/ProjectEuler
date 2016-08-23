/**
  * The 5-digit number, 16807=75, is also a fifth power. Similarly, the 9-digit number, 134217728=89, is a ninth power.

    How many n-digit positive integers exist which are also an nth power?
  */
import scala.util.control.Breaks

object Problem63 {
  def main(args: Array[String]) {
    def findpower(n : Int) = {
      val len = n.toString.length
      var flag =0
      val br = new Breaks
      br.breakable(
        for(b <- (2L to math.sqrt(n).toInt)) {
          if (n == math.pow(b, len)) {
            flag = 1
            br.break()
          }
        }
      )
      if(flag == 1)true
      else false
    }
    println(Stream.from(12).count(findpower(_)))
  }

}
