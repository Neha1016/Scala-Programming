object Main {
    def main(agrs:Array[String]) : Unit = {

        print("Enter your age :")
        val age = scala.io.StdIn.readInt()

        if(age >= 18){

            println("You are eligible to vote")
        }
        else{

            println("You are not eligible to vote")


        }
        

       
     


    
    }
}