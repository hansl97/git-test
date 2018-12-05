object day2_ch05 {

  def main(args: Array[String]): Unit = {

  val s = sum(1,4,9,16,25)
  println(s)

  val s2 = sum(1 to 5: _*)
  println(s2)

  }
  
  def sum(args: Int*) ={
    var result = 0
    for (arg <- args) result += arg
    result
  }
}
