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
    @tailrec
	  def penultimateHelper[A](prev: A, remaining: List[A]): A = {
	    remaining.tail.isEmpty match {
	      case true => prev
	      case _ => penultimateHelper(remaining.head, remaining.tail)
	    }
	  }

    penultimateHelper(input.head, input.tail)
  }

  def kth[A](input: List[A], k: Int): A = {
    @tailrec
	  def kthHelper[A](index: Int, k: Int, remaining: List[A]): A = {
	    index == k match {
	      case true => remaining.head
	      case _ => kthHelper(index + 1, k, remaining.tail)
	    }
	  }

    kthHelper(0, k, input)
  }

  def length[A](input: List[A]): Int = {
    @tailrec
	  def lengthHelper[A](counter: Int, remaining: List[A]): Int = {
	    remaining.tail.isEmpty match {
	      case true => counter
	      case _ => lengthHelper(counter + 1, remaining.tail)
	    }
	  }

    lengthHelper(0, input)
  }

  def reverse[A](input: List[A]): List[A] = {
    input.foldLeft(List[A]()) { (acc, elem) =>
      elem :: acc
    }
  }

  def isPalindrome[A](input: List[A]): Boolean = {
    input == input.reverse 
  }

  def flatten(input: List[Any]): List[Any] = {
    def flattenHelper(input: List[Any]): List[Any] = {
      input.foldLeft(List[Any]()) { (acc, elem) =>
        elem match {
          case elem: List[Any] =>
            flattenHelper(elem) ::: acc
          case _ =>
            elem :: acc
        }
      }
    }

    flattenHelper(input).reverse
  }

  def compress(input: List[Symbol]): List[Symbol] = {
    def compressHelper(input: List[Symbol], acc: List[Symbol]): List[Symbol] = {
      if (input.isEmpty)
        acc
      else
        if (input.head == acc.head)
          compressHelper(input.tail, acc)
        else
          compressHelper(input.tail, input.head::acc)
    }

    compressHelper(input.tail, List[Symbol](input.head)).reverse
  }

  def pack(input: List[Symbol]): List[List[Symbol]] = {
    def packHelper(input: List[Symbol],
                   last: Option[Symbol],
                   acc: List[List[Symbol]]): List[List[Symbol]] = {

      if (input.isEmpty)
        acc
      else
        if (last.isEmpty)
          packHelper(input.tail, Some(input.head), List[Symbol](input.head) :: acc)
        else
          if (input.head == last.get)
            packHelper(input.tail, Some(input.head), (input.head :: acc.head) :: acc.tail)
          else
            packHelper(input.tail, Some(input.head), List[Symbol](input.head) :: acc)
    }

    packHelper(input, None, List[List[Symbol]]()).reverse
  }
}
