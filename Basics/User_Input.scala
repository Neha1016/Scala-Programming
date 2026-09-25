object Main {
    def main(args:Array[String]) : Unit = {

        print("Enter your name: ")
        val name = scala.io.StdIn.readLine()
        
        print("Enter your age :")
        val age = scala.io.StdIn.readInt()

        println(s"Hello $name")
        println(s"you are $age years old" )
    }
}