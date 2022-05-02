package medium.lettercombinations


/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * 17. Letter Combinations of a Phone Number
 */
object LetterCombinations extends App {
  def num2letter(d:String) = {
    d match {
      case  "2"=> "abc"
      case  "3"=> "def"
      case  "4"=> "ghi"
      case  "5"=> "jkl"
      case  "6"=> "mno"
      case  "7"=> "pqrs"
      case  "8"=> "tuv"
      case  "9"=> "wxyz"
      case _ => ""
    }
  }
  def letterCombinations(digits: String): List[String] = {
    val letters = digits.split("").map(num2letter).toList
    letters.foldLeft(List(""))( (l, x) => for (li <- l; xi<-x) yield {li + xi} )
  }
}


//Runtime: 800 ms, faster than 21.11% of Scala online submissions for Letter Combinations of a Phone Number.
//Memory Usage: 66.3 MB, less than 55.56% of Scala online submissions for Letter Combinations of a Phone Number.