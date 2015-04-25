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
}
