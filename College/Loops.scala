object Loops {

  def main(args: Array[String]): Unit =  {

    var i = 1

    while(i <= 6) {

      println(i)

      i = i + 1

    }

    for(x <- 1 to 10) {

      if(x == 5)
        println("Five")
      else
        println(x)

    }

  }

}