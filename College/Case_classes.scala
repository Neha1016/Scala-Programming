object Case_classes {

  case class Person(name: String, age: Int)

  def main(args: Array[String]): Unit = {

    val people = List(
      Person("Shiv", 20),
      Person("Shivay", 21),
      Person("Om", 22),
      Person("Rudra", 23)
    )

    val adults = people.filter(person => person.age > 18)

    adults.foreach(person => println(person.name))
  }
}