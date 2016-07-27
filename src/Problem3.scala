object Problem3 {
  def main(args: Array[String]) {
    def factors(n: Long) = {
      (2 to math.sqrt(n).toInt).filter(n % _ ==0)
    }
    factors(600851475143L).filter(e => !(2 to (e - 1)).exists(x => e % x == 0)).max
  }
}
