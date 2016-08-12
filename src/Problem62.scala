/**
  * The cube, 41063625 (3453), can be permuted to produce two other cubes: 56623104 (3843) and 66430125 (4053). In fact, 41063625 is the smallest cube which has exactly three permutations of its digits which are also cube.

    Find the smallest cube for which exactly five permutations of its digits are cube.
  */
object Problem62 {
  def main(args: Array[String]) {

    val cubes = Stream.from(100).map(n => math.pow(n,3).toLong).take(10000).toList
    val solution = cubes.find(n1 => cubes.count(n2 => n2.toString.sorted == n1.toString.sorted) >= 5)

  }
}
