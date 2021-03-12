package com.knoldus.Stack

import org.scalatest.flatspec.AnyFlatSpec

class StackTest extends AnyFlatSpec {

  var stackList=new Stack[Int]

  //TestCase for empty stack
  "stack" should "be found for empty for empty stack" in{
    val res=stackList.isEmpty
    assert(res)
  }

  //TestCase for push
  it should "be able to push value into the list" in{
    val res=stackList.push(1)
    assert(stackList.peek==1)
  }

  //TestCase for peek
  it should "be able to get peek value" in{
    val res=stackList.get
    assert(stackList.peek==1)
  }

  //TestCase for pop
  it should "be able to remove value from the list" in{
    val res=stackList.pop
    assert(stackList.isEmpty)
  }

  //TestCase for deleting all the elements in stack
  it should "be able to remove all the values" in{
    val res=stackList.push(1)
    stackList.empty
    assert(stackList.isEmpty)
  }

  //Testcase for empty peek
  it should "fail for peek when stack is empty" in{
    val res=stackList.peek
    assert(res=="Stack is empty")
  }

  //TestCase for empty pop
  it  should "fail for pop when stack is empty" in{
    val res=stackList.pop
    assert(res=="Stack is empty")
  }

}
