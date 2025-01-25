import scala.annotation.tailrec

object MaxSum extends App {

  assert(maxSum(List(1, -2, 3, 5, 2))  == 10)
  assert(maxSum(List(1, -2, 1, -1, 5)) == 5)
  assert(maxSum(List(5, -2, 1, 1, 1))  == 6)
  assert(maxSum(List(1, -2, 5, -1, 1)) == 5)
  assert(maxSum(List(7, -2, 1, -1, 1)) == 7)
  assert(maxSum(List(1, -2, 1, -1, 7)) == 7)
  assert(maxSum(List(1, 1, 1, 1, 1)) == 5)
  assert(maxSum(List(1, 2, 1, -2, -1)) == 4)
  assert(maxSum(List(5)) == 5)

  def maxSum(nums: List[Int]): Int = {
    maxSum(0, nums)
  }

  @tailrec
  def maxSum(max: Int, nums: List[Int]): Int = {
    if (nums.isEmpty) max else maxSum(innerSum(max, nums), nums.dropRight(1))
  }

  @tailrec
  def innerSum(max: Int, nums: List[Int]): Int = {
    if (nums.isEmpty) max
    else {
      if (nums.sum > max) innerSum(nums.sum, nums.tail) else innerSum(max, nums.tail)
    }
  }
}
