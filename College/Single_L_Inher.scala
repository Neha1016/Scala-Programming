object Inheritance {

  def main(args: Array[String]): Unit =  {

// Parent class 

class Teacher {

  def teach(): Unit =  {
    println("Teacher is teaching ")
  }

}

// Child class inhertis Parent class 

class student extends Teacher {

  def learn() : Unit =  {
    println("Student is learning")
  }

}

    var a = new student()

    a.teach()
    a.learn()

  }

}