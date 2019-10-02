package com.ddlab.scala.loops.type1

import scala.util.control.Breaks._;
import scala.util.control.Breaks

object TestBreak {

  def testBreakLoopType1() {
    val a: Int = 6;
    breakable {
      for (i <- 0 to 10) {
        print(i + "\t");
        if (i == 6) break;
      }
    }
  }

  def testBreakLoopType2() {
    var num1 = 0;
    var num2 = 0;
    val x = List(5, 10, 15);
    val y = List(20, 25, 30);

    val outloop = new Breaks;
    val inloop = new Breaks;

    outloop.breakable {
      for (num1 <- x) {
        // print list x
        println(num1+"\t");
        inloop.breakable {
          for (num2 <- y) {
            //print list y
            println();
            print(num2+"\t");
            if (num2 == 25) {
              // inloop is break when
              // num2 is equal to 25
              inloop.break;
            }
          }
          // Here, inloop breakable
        }
      }

      // Here, outloop breakable
    }
  }
  def main(args: Array[String]): Unit = {
    testBreakLoopType1(); //Prints 0	1	2	3	4	5	6
    testBreakLoopType2();
  }
}