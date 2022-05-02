package medium.longestsubstring

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 3. Longest Substring Without Repeating Characters
 * */
object LongestSubstringWithoutRepeatingCharacters extends App {
  def lengthOfLongestSubstring(s: String): Int = {
    if(s == null || s.length == 0){
      return 0
    }else if(s.trim.isEmpty && s.length >= 1){
      return s.distinct.length
    }
    else{
      val isSpacePresent = s.contains(" ")
      val longestSubStrLength = s.split(" ").distinct.mkString("")
        .inits
        .flatMap(_.tails).filter(_.nonEmpty)
        .filter(s => s.length == s.distinct.length)
        .maxBy(_.length)
        .length
      return if (isSpacePresent) (longestSubStrLength + 1)  else longestSubStrLength
    }
  }
}


//scala> "teststring".inits.toList
//val res2: List[String] = List(teststring, teststrin, teststri, teststr, testst, tests, test, tes, te, t, "")

/**
 * Runtime: 3305 ms, faster than 6.76% of Scala online submissions for Longest Substring Without Repeating Characters.
 * Memory Usage: 488 MB, less than 5.34% of Scala online submissions for Longest Substring Without Repeating Characters.
 */

