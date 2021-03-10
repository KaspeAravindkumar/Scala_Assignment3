package com.knoldus.Stack

class Stack[A] {
  var items = List[A]()

  //function to get all values for stack
  def get: Unit = items.foreach(x => println(x))

  //function to check if stack is empty
  def isEmpty: Boolean = items.isEmpty

  //function to get first top element from stack
  def peek: Any = items match {
    case List() => "Stack is empty"
    case head :: rest => head
  }

  //function to remove top element from stack
  def pop: Any =
    items match {
      case List() => "Stack is empty"
      case head :: rest => items = rest; head
    }

  //function to add element on top in stack
  def push(value: A): Unit = items = value +: items

  //function to delete all elements from stack
  def empty: Unit = items = List()

}
