package com.knoldus.LastElement

import org.scalatest.flatspec.AnyFlatSpec

class LastElementTest extends AnyFlatSpec {
  val lastElement = new LastElement

  //Testcase for List of Integers
  "last element" should "be found for the list of int" in{
    val res=lastElement.getLastElement(List(1,3,6,9,11))
    assert(res==11)
  }

  //TestCase for List of strings
  it should "be found for the list of String" in{
    val res=lastElement.getLastElement(List("aravind","kumar","kaspe"))
    assert(res=="kaspe")
  }

  //Testcase for List of Any Data type
  it should "be found for the list of any data type" in{
    val res = lastElement.getLastElement(List(1,1404,"aravind",2.68))
    assert(res == 2.68)
  }

  //TestCase for empty list
  it should "give zero" in {
    val res = lastElement.listLength(List())
    assert(res == 0)
  }

  //TestCase for Throwing Errors
  it should "throw error" in {
    val res = lastElement.getLastElement(List())
    assert(res == "java.lang.IndexOutOfBoundsException: -1")
  }

}
