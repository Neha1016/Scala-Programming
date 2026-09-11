object Collections {
    def main(args:Array[String]): Unit = {
        
        val nums = List(4,8,2,14,17,22)

        val sum = nums.sum
        println("Sum = " + sum)

        val maximum = nums.max
        println("Maximum = " + maximum)

        val evenNumbers = nums.filter(n => n % 2 == 0)
        println("Even numbers = " + evenNumbers)

        val doubled = nums.map(n => n*2)
        println("Doubled = " + doubled)
    }
}