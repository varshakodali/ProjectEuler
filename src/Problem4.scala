
object Problem4 {
  def main(args: Array[String]) {
    var solution = (100 to 999).flatMap(n1 => (100 to 999).map(_ * n1)).filter(n2 => n2.toString == n2.toString.reverse).max
  }
}
