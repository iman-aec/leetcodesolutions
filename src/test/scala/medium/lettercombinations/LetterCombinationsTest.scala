package medium.lettercombinations

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should

class LetterCombinationsTest extends AnyFreeSpec with should.Matchers {
  val letterCombinations = LetterCombinations
  "Letter Combinations" - {
    "Should find all letter combinations from given numbers" in {
      letterCombinations.letterCombinations("23") should be(List("ad","ae","af","bd","be","bf","cd","ce","cf"))
      letterCombinations.letterCombinations("") should be(List())
      letterCombinations.letterCombinations("2") should be(List("a","b","c"))
    }
  }

}