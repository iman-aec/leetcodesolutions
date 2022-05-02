package easy.longestcommonprefix


/**
 * https://leetcode.com/problems/longest-common-prefix/
 * 14. Longest Common Prefix
 * */
object LongestCommonPrefix extends App{
  def longestCommonPrefix(strs: Array[String]): String = {
    val minStrLength = strs.minBy(_.length).length

    return strs.map{s =>
      (1 to minStrLength).map(s.take(_)) //create list of substrings from each string
    }
      .reduce{ _.intersect(_) } // find common substring by intersection of 2 lists
      .sortBy(-_.length()) // sorting by substring length
      .headOption.getOrElse("")
  }
}

//Runtime: 665 ms, faster than 68.25% of Scala online submissions for Longest Common Prefix.
//Memory Usage: 55.8 MB, less than 78.31% of Scala online submissions for Longest Common Prefix.
