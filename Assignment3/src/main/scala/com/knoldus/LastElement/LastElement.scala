package com.knoldus.LastElement

import scala.collection.immutable.List

class LastElement {

  //function that returns the length of the list
  def listLength[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: hasValue => 1 + listLength(hasValue)
  }

  //function to get last element of list
  def getLastElement[A](list: List[A]): Any = {
    try {
      list(listLength(list) - 1)
    } catch {
      case i:IndexOutOfBoundsException => i.toString
    }
  }

}
