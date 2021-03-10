package com.knoldus.LastElement

import scala.collection.immutable.List

object LastElementImplementation extends App {

  val lastElement = new LastElement

  val list: List[Any] = List("Aravind", "Kumar", 1404, "kaspe", 23.6)

  println(s"Last element of $list is  ${lastElement.listLength(list)}(index) - ${lastElement.getLastElement(list)}(Value)")

}
