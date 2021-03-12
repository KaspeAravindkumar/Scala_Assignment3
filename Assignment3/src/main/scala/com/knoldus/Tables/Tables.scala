package com.knoldus.Tables

import scala.collection.immutable.List

class Tables {
  //function that writes the multiplication table for each element
  def multiplicationTable(list: List[Int]): List[List[Int]] = {
    val tables = for (number <- list) yield {
      val table = for (element <- (1 to 10)) yield {
        number * element
      }
      table.toList
    }
    tables
  }
}
