/* 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

  What is the sum of the digits of the number 21000?
*/

object Problem16 {
  def main(args: Array[String]) {
    val solution = BigInt(2).pow(1000).toString().map(_.asDigit).sum
  }
}

// Reference: BigInt - http://grokbase.com/t/gg/scala-user/12bptz4gmc/pow-for-int