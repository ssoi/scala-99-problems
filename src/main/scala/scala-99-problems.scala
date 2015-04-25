package com.sameersoi.scala99problems

object ListSolutions {
  def last[A](input: List[A]): A = {
    input.length match {
      case 1 =>
        input.head
      case _ =>
        last(input.tail)
    }
  }
}
