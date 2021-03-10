package com.knoldus.Tables

import scala.collection.immutable.List
import scala.io.StdIn.readInt

object TablesImplementation extends App {

  val tables = new Tables
  println("Enter the number of elements in the list :")
  val number = readInt()

  println(s"Enter $number elements for the list of Integers : ")
  val list: List[Int] = List.fill(number) {
    scala.io.StdIn.readInt()
  }

  tables.getTable(list)
}
