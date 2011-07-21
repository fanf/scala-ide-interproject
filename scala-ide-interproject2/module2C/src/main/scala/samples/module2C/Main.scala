package samples.module2C

import samples.module1B.Impl1

object Main {

  def main(args: Array[String]): Unit = { 
    
    val x = new Impl1()
    
    println(x.foo("hello world"))
    
  }

}