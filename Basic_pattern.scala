object DayExample {

  def checkDay(day: String): String = {

    day match {
      case "Saturday" => "Weekend"
      case "Sunday"   => "Weekend"
      case _          => "Weekday"
    }
  }

  def main(args: Array[String]): Unit = {

    println(checkDay("Monday"))
    println(checkDay("Saturday"))
    println(checkDay("Sunday"))

  }
}