/*
  4) Write a program to sum of the digits of the product of numbers from 1 to n.
For example: For, n = 5
1*2*3*4*5 = 120
1+2+0 = 3 
*/
object Problem4 extends App {
  val num = 7
  val sum = (1 to num).toList.foldLeft(1){ _ * _ }
  val split = sum.toString.toList.map(x => x - 48)
  val s = split.foldLeft(0){_ + _ }
  println(s)
}
