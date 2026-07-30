
object Main {

    def main(args: Array[String]) : Unit =  {

class Person {

  def display() : Unit = {
    println("This is Person")
  }

}

class Teacher extends Person {

  override def display() : Unit = {
    println("This is Teacher")
  }

}

    var t = new Teacher()

    t.display()

  }

}