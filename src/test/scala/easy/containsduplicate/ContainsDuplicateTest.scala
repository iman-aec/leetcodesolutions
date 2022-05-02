package easy.containsduplicate

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should

class ContainsDuplicateTest extends AnyFreeSpec with should.Matchers {
  val containsDuplicate = ContainsDuplicate
  "Contains Duplicate" - {
    "Should find all letter combinations from given numbers" in {
      containsDuplicate.containsDuplicate(Array(1, 2, 3, 1)) should be(true)
      containsDuplicate.containsDuplicate(Array(1,2,3,4)) should be(false)
      containsDuplicate.containsDuplicate(Array(1,1,1,3,3,4,3,2,4,2)) should be(true)
    }
  }
}
