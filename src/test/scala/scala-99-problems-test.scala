import com.sameersoi.scala99problems.ListSolutions
import org.scalatest.FunSuite

class SolutionsSpec extends FunSuite {
  test("P01: Last element of a list") {
    val expected = 5 
    val result = ListSolutions.last(List[Int](1, 2, 3, 4, 5))

    assert(result == expected)
  }

  test("P02: Next to last element of a list") {
    val expected = 4 
    val result = ListSolutions.penultimate(List[Int](1, 2, 3, 4, 5))

    assert(result == expected)
  }

  test("P03: Kth element of a list") {
    val expected = 4 
    val result = ListSolutions.kth(List[Int](1, 2, 3, 4, 5), 3)

    assert(result == expected)
  }

  test("P04: Length of a list") {
    val expected = 4 
    val result = ListSolutions.length(List[Int](1, 2, 3, 4, 5))

    assert(result == expected)
  }

  test("P05: Reverse a list") {
    val expected = List[Int](5, 4, 3, 2, 1)
    val result = ListSolutions.reverse(List[Int](1, 2, 3, 4, 5))

    assert(result == expected)
  }

  test("P06: Determine if a list is a palindrome") {
    val expectedPalindrome = List[Int](1, 2, 3, 2, 1)
    val expectedNotPalindrome = List[Int](1, 2, 3, 3, 1)

    assert(ListSolutions.isPalindrome(expectedPalindrome))
    assert(!ListSolutions.isPalindrome(expectedNotPalindrome))
  }

  test("P07: Flatten a nested list structure") {
    val expected: List[Any] = List(1, 1, 2, 3, 5, 8)
    val result = ListSolutions.flatten(List(List(1, 1), 2, List(3, List(5, 8))))

    assert(result == expected)
  }

  test("P08: Eliminate consecutive duplicates of list elements") {
    val expected: List[Symbol] =  List('a, 'b, 'c, 'a, 'd, 'e)
    val result = ListSolutions.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

    assert(result == expected)
  }

  test("P09: Pack consecutive duplicates of list elements into sublists") {
    val expected: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    val result = ListSolutions.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

    assert(result == expected)
  }
}
