object Option_Handling {

    def safeDivide(a: Int,b:Int): Option[Int] = {

        if (b == 0)
            None
        else
            Some(a/b)
    }

    def main(args:Array[String]) : Unit = {

        val result1 = safeDivide(10,2)
        val result2 = safeDivide(10,0)

        println(result1)
        println(result2)

        for {
            x <- safeDivide(20,2)
            y <- safeDivide(x,2)
        }{
            println("Final Result:" + y)
    }
}
}