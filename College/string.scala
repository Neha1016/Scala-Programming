object StringManipluation{

def reverseString(text:String):String= {
    text.reverse

}
def countVowels(text:String):Int={
    text.toLowerCase.count(ch=> "aeiou".contains(ch))
}
def isPalindrome(text:String):Boolean= {
    text == text.reverse
}

def main(args:Array[String]):Unit = {
    val text = "Scala is fun"

    println("Original String:" + text)

    println("Reverse String:" + reverseString(text))

    println("Number of Vowels:" + countVowels(text))

    val word = "madam"

    if(isPalindrome(word))
        println( word + " is palindrome")
    else
        println( word + "is not a plindorme")

}
}

