
object Problem1 {
  def main(args: Array[String]) {
    var solution = (1 until  1000).filter{e => e % 3==0 || e % 5==0}.sum
  }
}
