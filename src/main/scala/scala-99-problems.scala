package com.sameersoi.scala99problems

import scala.annotation.tailrec

object ListSolutions {
  def last[A](input: List[A]): A = {
    input.tail.isEmpty match {
      case true => input.head
      case _ => last(input.tail)
    }
  }
}
