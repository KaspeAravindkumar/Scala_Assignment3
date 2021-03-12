package com.knoldus.Queue

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {

  val queueList=new Queue[Int]

  //TestCase for empty Queue
  "Queue" should " be empty for empty queue" in{
    val res=queueList.isEmpty
    assert(res==true)
  }

  //TestCase for enqueue
  it should " be add the value for enqueue" in{
    val res = queueList.enqueue(2)
    assert(queueList.front==2)
  }

  //TestCase for dequeue
  it should " be able remove the value" in{
    queueList.enqueue(3)
    queueList.enqueue(4)
    val res = queueList.dequeue
    assert(res == List(3,4))
  }

  //TestCase for empty dequeue
  it should " fail to remove the value from empty Queue" in{
     queueList.empty
    val res = queueList.dequeue
    assert(res =="No element found")
  }

  //TestCase for empty front
  it should " fail to display the value from empty Queue" in{
    val res = queueList.front
    assert(res =="No element found")
  }

  //TestCase for deleting all the elements
  it should "delete all the elements in queue" in{
    queueList.enqueue(6)
    queueList.empty
    assert(queueList.isEmpty)
  }





}

