object Main {
    def main(args:Array[String]) : Unit = {

        print("Enter your marks :")
        val marks = scala.io.StdIn.readInt()

        if( marks < 0 || marks > 100){

            println("Invalid marks")

        }

        else if( marks >= 90){

            println("Your grade is A")
        }

        else if (marks >= 80){

            println("Your grade is B")
        }
        else if (marks >= 70){

            println("Your grade is C")
        }
        else if( marks >= 60){

            println("Your grade is D")
        }
        else {
            println("Fail")
        }


    }
}