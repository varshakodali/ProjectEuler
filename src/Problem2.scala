
object Problem2 {
  def main(args: Array[String]) {
    def fibonacci(x: Int, y: Int): Stream[Int] = x #:: fibonacci(y,x+y)
    var solution = fibonacci(1,2).takeWhile( _  <= 4000000).toList.filter( _ % 2 == 0).sum
  }
}
