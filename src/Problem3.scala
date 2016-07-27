object Problem3 {
  def main(args: Array[String]) {
    def factors(n: Long) = {
      (2 to math.sqrt(n).toInt).filter(n % _ ==0)
    }
    factors(600851475143L).filter(i => !(2 to (i - 1)).exists(x => i % x == 0)).max
  }
}
