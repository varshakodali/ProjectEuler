/**
  * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

    If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

  * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/
object Problem17 {
  def main(args: Array[String]): Unit = {
    val ones = Map(
      0 -> "zero",
      1 -> "one",
      2 -> "two",
      3 -> "three",
      4 -> "four",
      5 -> "five",
      6 -> "six",
      7 -> "seven",
      8 -> "eight",
      9 -> "nine"
    )
    val teens = Map(
      0 -> "ten",
      1 -> "eleven",
      2 -> "twelve",
      3 -> "thirteen",
      4 -> "fourteen",
      5 -> "fifteen",
      6 -> "sixteen",
      7 -> "seventeen",
      8 -> "eighteen",
      9 -> "nineteen"
    )
    val tens = Map(
      2 -> "twenty",
      3 -> "thirty",
      4 -> "forty",
      5 -> "fifty",
      6 -> "sixty",
      7 -> "seventy",
      8 -> "eighty",
      9 -> "ninety"
    )
    def textOf(n :Int): String = {
      n match {
        case x if x < 10 => ones(x)
        case x if x < 100 && x >= 10 => x match {
          case x if x < 20 => teens(x % 10)
          case y if y % 10 == 0 =>  tens(y/10)
          case z => tens(z/10) + ones(z % 10)
        }
        case x if x >=100 && x < 1000 => x match {
          case x if x % 100 == 0 => ones(x/100) + "hundred"
          case x => ones(x/100) + "hundredand" + textOf(x % 100)
        }
        case x if x == 1000 => "onethousand"
      }
    }
    val solution = (1 to 1000).map(x => textOf(x).size).sum
  }
}
