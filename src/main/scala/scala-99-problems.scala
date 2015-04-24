package com.sameersoi.scala99problems

object problem_01 {
  def last[A](input: List[A]): A = {
    input.length match {
      case 1 =>
        input.head
      case _ =>
        last(input.tail)
    }
  }
}
