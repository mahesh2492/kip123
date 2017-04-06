/*
  1) Write a program using string interpolation and a list.
For example:  if the list is List(10,20,30,40) output should be
0 = 10
1 = 20
2 = 30

*/

object Problem1 extends App
{
   val list = List(10,20,30,40)
   for(l <- list) {
      val index = list.indexOf(l)
      println(s"$index $l")
     }
}
