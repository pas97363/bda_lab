import scala.collection.mutable.ArrayBuffer;
object MinMax {
  def main(args: Array[String]): Unit = {
    var numArray = new ArrayBuffer[Int]()
    println("Enter number of elements")
    val n = scala.io.StdIn.readInt()
    println("Enter elements")
    for (i <- 1 to n)
      numArray += scala.io.StdIn.readInt()
    println("The elements of array are")
    println(numArray)
    val result = minmax(numArray)
    println("Minimum number is " + result._1)
    println("Maximum number is " + result._2)
  }
  def minmax(numArray:ArrayBuffer[Int]): (Int,Int) = {
    var min:Int = 999
    var max:Int = -999
    for(n<-numArray){
      if(n<min)
        min=n
      if(n>max)
        max=n
    }
    (min,max)
  }
}