/**
  * In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
  *
  *1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
  *It is possible to make £2 in the following way:
  *
  *1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
  * How many different ways can £2 be made using any number of coins?
**/
object Problem31 {

  def main(args: Array[String]): Unit = {
    def solution: Int  = {
      var combinations = 0
      for (x1 <- (200 to 0) by -200; x2 <- (x1 to 0) by -100; x3 <- (x2 to 0) by -50; x4 <- (x3 to 0) by -20; x5 <- (x4 to 0) by -10;
           x6 <- (x5 to 0) by -5; x7 <- (x6 to 0) by -2) {
        combinations += 1
      }
      combinations
    }
  }
}

// Reference: Brute force solution