
object Demo {

  def main(args: Array[String]) : Unit = {


class Student {

  private var marks = 0

  def setMarks(m: Int) : Unit =  {
    marks = m
  }

  def getMarks(): Int = {
    marks
  }

  def result() : Unit =  {
    println("Student Result")
  }

}

class Exam extends Student {

  override def result() : Unit =  {

    if(getMarks() >= 33)
      println("Pass")
    else
      println("Fail")

  }

}

    var s = new Exam()

    s.setMarks(31)


    println("Marks = " + s.getMarks())

    s.result()

  }

}