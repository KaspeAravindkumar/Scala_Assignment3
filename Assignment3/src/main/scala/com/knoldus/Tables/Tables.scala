package com.knoldus.Tables

import scala.collection.immutable.List

class Tables {
  //function that writes the table for each element
  def table(tableNumber: Int, multiplier: Int): Unit = {
    if (multiplier > 10) {
      println("**********************")
      return
    }
    println(tableNumber + " * " + multiplier + " = " + tableNumber * multiplier)
    table(tableNumber, multiplier + 1)
  }

  //function to extract each element from the list and write its table
  def getTable(list: List[Int]): Unit = {
    list.foreach(number => table(number, 1))
  }

}
