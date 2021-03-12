package com.knoldus.Tables

import org.scalatest.flatspec.AnyFlatSpec

class TablesTest extends AnyFlatSpec {
  val tables=new Tables

  //TestCase for single element in the List
  "table " should "be found for each integer in list" in{
    val res=tables.multiplicationTable(List(2))
    assert(res==List(List(2,4,6,8,10,12,14,16,18,20)))
  }

  //TestCase for List Of integers
  it should "give tables" in {
    val res = tables.multiplicationTable(List(2,5,10))
    assert(res == List(List(2,4,6,8,10,12,14,16,18,20),List(5,10,15,20,25,30,35,40,45,50),List(10,20,30,40,50,60,70,80,90,100)))
  }

  //TestCase for empty list
  it should "give empty list" in {
    val res = tables.multiplicationTable(List())
    assert(res == List())
  }

}
