import scala.util.control.Breaks

/**
  * Created by varsha on 8/14/16.
  */
object Problem55 {
  def main(args: Array[String]) {
    def palindrome(x : Int): Boolean = {
      val b = new Breaks
      var temp = x
      var i = 0
      var flag = 0
      b.breakable (
        while(i < 50) {
          val pal = (x + x.toString.reverse.toInt)
          if(pal.toString.reverse == pal.toString) {
            flag = 1
            b.break()
          }
          else {
           temp = (x + x.toString.reverse.toInt)
          }
        }
      )
      if(flag == 1) true
      else false
    }
    println((10 to 100).filter(n => palindrome(n)))
  }
}
