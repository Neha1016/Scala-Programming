// object FizzBuzz {

//     def main(args:Array[String]): Unit = {

//     for (i <- 1 to 100){

//         if(i % 3 == 0 && i % 5 == 0)
//             println("FizzBuzz")
//         else if (i % 3 == 0)
//             println("Fizz")
//         else if (i % 5 == 0)
//             println("Buzz")
//         else
//             print(i)
//         }
//     }
// }


object FizzBuzz {
    def main(args:Array[String]) : Unit = {

    (1 to 100).foreach {i =>

    if(i % 3 == 0 && i % 5 == 0)
        println("FizzBuzz")
    else if (i % 3 == 0)
        println("Fizz")
    else if (i % 5 == 0)
        println("Buzz")
    else
        print(i)
        }
    }
}

