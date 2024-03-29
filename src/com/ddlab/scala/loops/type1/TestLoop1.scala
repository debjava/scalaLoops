package com.ddlab.scala.loops.type1

object TestLoop1 {

  def showLoop1() {
    var i = 0;

    for (i <- 1 to 10) {
      println("Value of I : " + i); //It will print 1 to 10
    }
  }

  def showLoop2() {
    var i = 0;

    for (i <- 1 until 10) {
      print(i + "\t"); //It will print 1 to 9
    }
  }

  def showLoop3() {
    var i = 0;
    var j = 0;

    for (i <- 1 to 3; j <- 1 to 3) {
      println("I:" + i + "<--->" + "J:" + j);
    }
  }

  def showLoopForList() {
    val myList = List(1, 2, 3, 4, 5, 67, 8, 9);
    //show the list data
    for (x <- myList) {
      println("List Value : " + x);
    }
  }

  def showLoopWithFilters() {
    val myList = List(1, 2, 3, 4, 5, 67, 8, 9);
    //show the list data
    for (x <- myList; if x != 3; if x < 8) {
      println("List Value : " + x);
    }
  }

  def showYieldUsages() {
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9);
    val retVal = for (x <- numList; if x != 3; if x < 7) yield x;
    //Now show the value
    for (x <- retVal)
      println("Value of X : " + x);
  }

  def showLoopIncrementedBy2() {
    var max: Int = 10;
    for (i <- 0 until max by 2) {
      println("Value of I incremented by 2: " + i);
    }
  }

  def forLoopWithYeild() {
    var rank = 0;
    val ranklist = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    var output = for {
      rank <- ranklist
      if rank > 4; if rank != 8
    } yield rank;

    // Display result
    for (rank <- output) {
      println("Author rank is : " + rank);//Prints 5 to 10
    }
  }

  def main(args: Array[String]) {
    //    showLoop1();
    //    showLoop2();
    showLoop3();
    //    showLoopForList();
    //    showLoopWithFilters();
    //    showYieldUsages();
    //    showLoopIncrementedBy2();
//    forLoopWithYeild();
  }
}