/**
  * Created by varsha on 8/7/16.
  */
object Problem24 {
  def main(args: Array[String]) {
    val solution = (0 to 9).permutations.take(1000000).toList.reverse.head.mkString("")
  }
}

// Reference:  Scala permutations & combinations - http://stackoverflow.com/questions/24586189/are-combinations-and-permutations-stable-in-scala-collections