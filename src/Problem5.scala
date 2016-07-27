object Problem5 {
  def main(args: Array[String]) {
    val  solution = (20 to Int.MaxValue).filter(n => (2 to 20).forall(n % _ == 0 )).min
  }
}
