package com.knoldus.Stack

object StackImplementation extends App {
  val stack = new Stack[Any]

  //check is stack is empty
  println(s"Stack is empty: ${stack.isEmpty}")

  // adding elements in stack
  stack.push("Kaspe")
  stack.push("Aravind")
  stack.push("kumar")
  stack.push(1404)
  stack.push(3)
  stack.push(2.78)

  //printing all element of stack
  println("Added Elements of stack is : ")
  stack.get
  println("-------------------------")

  //removing element from stack
  assert(stack.pop == 2.78)
  println("Removing element 2.78")

  //printing all element of stack
  println("Elements of stack : ")
  stack.get
  println("-------------------------")

  //printing top element
  println(s"Top element of stack : ${stack.peek}")

  //deleting all elements from stack
  stack.empty
  println("Deleting all elements from stack .........")
  println("Elements of stack : ")
  stack.get
  println(s"Stack is empty: ${stack.isEmpty}")
  println("Stack operations done on list.")
}
