// 2018.12.05 wednesday

// Scala programming - chapter 02

object day2_ch01 {
    
  def main(args: Array[String]) : Unit = {

    var r = 1
    var n = 10   

    while (n > 0) {
      r = r*n		// in scala, do not use ; (semicolon)
      n -= 1	        // in scala, do not use ; (semicolon)
    }

    println(r)


    r = 1
    n = 10
    for (i <- 1 to n)
      r = r * i
    println(r)

   
    val s = "Hello"
    var sum = 0
    for (i <- 0 until s.length())
      sum += s(i)
    println(sum)


    sum = 0
    for (ch <- "Hello") sum += ch
    println(sum)


    import scala.util.control.Breaks._
    breakable {
      for (ch <- "Hello World") {
        if (ch == ' ') break;
        println(ch)
      }
    }


  }

}
