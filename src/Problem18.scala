/**
    You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September,
    April, June and November.
    All the rest have thirty-one,
    Saving February alone,
    Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.
    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
    How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

**/
object Problem18 {

  def main(args: Array[String]): Unit = {
    val solution = ((1901 to 2000).map(x => {
      if( x%4 == 0)
        List(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
      else
        List(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    }).flatten.scanLeft(0)((m1, m2) => (m1 + m2) % 7).count(_ == 0)-1)
  }
}
