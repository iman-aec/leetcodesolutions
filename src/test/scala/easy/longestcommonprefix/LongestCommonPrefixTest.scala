package easy.longestcommonprefix

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should

class LongestCommonPrefixTest extends AnyFreeSpec with should.Matchers {
  val longestCommonPrefix = LongestCommonPrefix
  "Longest Common Prefix" - {
    "Should find the longest common prefix from an array" in {
      longestCommonPrefix.longestCommonPrefix(Array("flower","flow","flight")) should be("fl")
      longestCommonPrefix.longestCommonPrefix(Array("dog","racecar","car")) should be("")
    }
  }

}
