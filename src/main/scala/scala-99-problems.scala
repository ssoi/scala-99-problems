package com.sameersoi.scala99problems

import scala.annotation.tailrec

object ListSolutions {
  def last[A](input: List[A]): A = {
    input.tail.isEmpty match {
      case true => input.head
      case _ => last(input.tail)
    }
  }

  def penultimate[A](input: List[A]): A = {
	  def penultimateHelper[A](prev: A, remaining: List[A]): A = {
	    remaining.tail.isEmpty match {
	      case true => prev
	      case _ => penultimateHelper(remaining.head, remaining.tail)
	    }
	  }

    penultimateHelper(input.head, input.tail)
  }

  def kth[A](input: List[A], k: Int): A = {
	  def kthHelper[A](index: Int, k: Int, remaining: List[A]): A = {
	    index == k match {
	      case true => remaining.head
	      case _ => kthHelper(index + 1, k, remaining.tail)
	    }
	  }

    kthHelper(0, k, input)
  }
}
