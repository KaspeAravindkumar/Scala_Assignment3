package com.knoldus.Queue

object QueueImplementation extends App {
  val queue = new Queue[Int]

  //check is queue is empty
  println(s"Queue is empty : ${queue.isEmpty} ")

  //to add elements in queue
  queue.enqueue(1)
  queue.enqueue(2)
  queue.enqueue(3)
  queue.enqueue(4)
  queue.enqueue(5)
  queue.enqueue(6)

  //print whole queue
  println(s"Added Queue :  ${queue}")

  //to get first element of queue
  println(s"Front element of Queue : ${queue.front} ")

  //to remove element from queue
  println(s"Remove element ${queue.dequeue} from Queue")
  println(s"Remove element ${queue.dequeue} from Queue")

  //print whole queue
  println(s"Queue :  ${queue}")

  //check if queue is empty
  println(s"Queue is empty : ${queue.isEmpty} ")
}

