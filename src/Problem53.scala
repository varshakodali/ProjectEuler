/**
  * There are exactly ten ways of selecting three from five, 12345:

    123, 124, 125, 134, 135, 145, 234, 235, 245, and 345

    In combinatorics, we use the notation, 5C3 = 10.

    In general,

    nCr =
    n!
    r!(n−r)!
    ,where r ≤ n, n! = n×(n−1)×...×3×2×1, and 0! = 1.
    It is not until n = 23, that a value exceeds one-million: 23C10 = 1144066.

    How many, not necessarily distinct, values of  nCr, for 1 ≤ n ≤ 100, are greater than one-million?
  */
object Problem53 {
  def main(args: Array[String]) {
    def combinations(n: BigInt, r: BigInt): BigInt = {
      if(n == r) 1
      else
        (BigInt(1) to n).product/((BigInt(1) to r).product * (BigInt(1) to n-r).product)
    }
    val solution = Stream.from(23).takeWhile(_ <= 100).flatMap(n => (BigInt(1) to BigInt(n)).map(r => combinations(n,r))).filter(_ > 1000000).size
  }
}
