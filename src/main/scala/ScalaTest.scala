object ScalaTest {
  def main(args: Array[String]): Unit = {
    println("helloworld")
    println(100+1.00)
    println(add(1,7))
    sayName("zhangsan","lisi","wanger","mazi")
    for(i <- 1 to 10) print(i + "_")
    println()
    for (i <- 1 to 9;j <- 1 to 9) {
      if (j < i) print(j + "*" + i + "=" + i*j + "\t" )
      else if(j == i)
      println(j + "*" + i + "=" + i*j)
    }
  }

  def add(a:Int , b: Int) : Int = {
    a+b
  }
  // 与add()方法一样
  def add1(a:Int , b: Int) = a+b


  def sayName(name : String*): Unit = {
    println(name)
  }

}
