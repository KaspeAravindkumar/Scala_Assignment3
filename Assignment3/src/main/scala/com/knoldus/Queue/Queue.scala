package com.knoldus.Queue

class Queue[A] {
  var items: List[A]= List()

  //function to check if queue is empty
  def isEmpty: Boolean = items.isEmpty

  //function to add values in queue
  def enqueue(value: A): Unit = items = items :+ value

  //function to remove values from queue
  def dequeue: Any =  {
    if( items.isEmpty) "No element found"
    else items.tail
  }

  //function to get first value from queue
  def front: Any =  {
      if(items.isEmpty) "No element found"
      else items.head
  }

  //function to delete all elements from stack
  def empty: Unit = items = List()

}
