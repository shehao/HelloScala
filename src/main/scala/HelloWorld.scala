package main.scala

/**
  *  类名必须使用object修饰
  */
object HelloWorld {
  val result:Int=200;//scala中推荐使用val
  def main(args: Array[String]): Unit = {//mian方法和java一样都是程序的入口
    var msg:String ="hell world"        //变量的声明方式 var 声明一个变量 普通变量   val声明的变量相当于java中的final修饰的变量
    println(msg);
    val i=1000;
    println(result)
    println(i)
  }
}
