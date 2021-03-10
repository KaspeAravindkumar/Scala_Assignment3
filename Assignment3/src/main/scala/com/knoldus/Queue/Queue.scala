package com.knoldus.Queue

class Queue[A] {

  //class to create node
  private[this] class Node[A](val value: A) {
    var next: Option[Node[A]] = None

    def append(n: Node[A]) = next = Some(n)
  }

  //head element for queue
  private[this] var head: Option[Node[A]] = None

  //tail element for queue
  private[this] var tail: Option[Node[A]] = None

  //function to check if queue is empty
  def isEmpty = head.isEmpty

  //function to add values in queue
  def enqueue(item: A) = {
    val n = new Node(item)
    if (isEmpty) head = Some(n) else tail.get.append(n)
    tail = Some(n)
  }

  //function to remove values from queue
  def dequeue = head match {
    case Some(item) =>
      head = item.next
      item.value
    case None => "No element found"
  }

  //function to get first value from queue
  def front = head match {
    case Some(item) => item.value
    case None => "No element found"
  }

  //function to iterate queue
  def iterator: Iterator[A] = new Iterator[A] {
    private[this] var it = head

    override def hasNext = it.isDefined

    override def next: A = {
      val n = it.get
      it = n.next
      n.value
    }
  }

  //function to get queue object as String
  override def toString() = iterator.mkString("Queue(", ", ", ")")
}
