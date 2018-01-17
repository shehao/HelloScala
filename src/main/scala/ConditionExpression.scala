package main.scala

/**
  * 条件表达式
  */
object ConditionExpression {
  def main(args: Array[String]): Unit = {
    val x=1
    val m=if(x>0)10 else -9  //此时返回的值为int m:Int=10
    println(m)


    //支持混合类型表达式  返回值不确定 声明时要么不写,要么就是这两种值类型的父类
    var s=if(x>1) 100 else "error"  //此时返回的值的类型为Any s :Any="error"  Any是Int和String的父类
    println(s)

    //如果缺失else  就相当于 if(x>2) 100  else ()     其中() 相当于void就是没有值
    var y=if(x>2) 100  //此时的返回值为AnyValue  y:AnyValue=()
    println(y)

    //if  else if  语法
    var z=if(x>=1)20 else if(x<1) 0 else -1
    println(z)

  }

}
