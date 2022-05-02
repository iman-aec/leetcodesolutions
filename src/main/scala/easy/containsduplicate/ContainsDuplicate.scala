package easy.containsduplicate

/**
 * https://leetcode.com/problems/contains-duplicate/
 * 217. Contains Duplicate
 */
object ContainsDuplicate extends App {
  def containsDuplicate(nums: Array[Int]): Boolean = {

    @annotation.tailrec
    def containsDups[A](list: List[A], seen: Set[A] = Set[A]()): Boolean =
      list match {
        case x :: xs => if (seen.contains(x)) true else containsDups(xs, seen + x)
        case _ => false
      }

    /**
     * Runtime: 947 ms, faster than 82.94% of Scala online submissions for Contains Duplicate.
     * Memory Usage: 69.5 MB, less than 98.10% of Scala online submissions for Contains Duplicate.
     */
    return containsDups(nums.toList)

  }
}

/**
 * Note - Runtime: 1181 ms, faster than 70.14% of Scala online submissions for Contains Duplicate.
 *  Memory Usage: 99.7 MB, less than 17.54% of Scala online submissions for Contains Duplicate.
 */
// return nums.toList.distinct.size != nums.size

/**
 * Runtime: 947 ms, faster than 82.94% of Scala online submissions for Contains Duplicate.
 * Memory Usage: 69.5 MB, less than 98.10% of Scala online submissions for Contains Duplicate.
 */
// return nums.toSet.size != nums.size

