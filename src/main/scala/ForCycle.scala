package main.scala

/**
  * for 循环
  */
object ForCycle {
  def main(args: Array[String]): Unit = {
    for(i<- 1 to 10) println(i)  // 1 to 10 返回的是一个Range(1,2,3,4,5,6,7,8,9,10)  包头也包尾[0,10]
    for(i<- 1 until 10) println(i)  // 1 until 10 返回的是一个Range(1,2,3,4,5,6,7,8,9)  包头不包尾[1,10)
    val str="hell0123"
    for(c <- str)println(c)
    print(str.charAt(0))//str.charAt(index) 去数组下表   数组取值   arr(0) 表示去第一个值

  println("================================")
    for(i<- 0 until str.length)println(str.charAt(i))

    println("========================array====================")

    val arr=Array(1,2,2,3,4,5,6,4,5,6,78,9)  //执行的结果应该是 arr:Array[Int]=Array(1,2,2,3,4,5,6,4,5,6,78,9)
    for(c <-arr)println(c)    //增强 for循环
    println("========================index  get  param================")
    //使用下标来获取数组中的某个值
    for(i <- 0 until arr.length ) println(arr(i))  //scala数组根据下标获取值的语法和java不一样 java是arr[index]   scala 是 arr(index)  一个是中括号一个是小括号


    //嵌套循环
    /**  java 语法
      * for(int i=0 ;i<3;i++){
      *
      *   for(int m=0;m<3;m++){
      *    if(i!=m){
      *    println(10*i+j)
      *    }
      *   }
      *
      * }
      */
    // scala 语法  上面的java代码和下面的scala代码效果一样
    for(i <- 0 to 3; j <- 0 to 3 if( i!=j)){
      println(10*i+j)
    }

    //将一个数组中的每个元素取出都乘10并装到一个新的数组中
    // 方法1
    val arr2=Array(1,2,2,2,2,2,3,3,3)
    val ints = for(i <-arr2)yield i*10  //将arr2进行增强for循环遍历并将arr2中的每个数据都乘以10并返回一个新的数组
    println("-------------------------------------")
    println(ints(1))
    println("==================******************======================")
    //方法2   map方法中国传入的是一个匿名函数????
    val ints2 = arr2.map(_*10)
    val ints1 = arr2.map(x=>x*10)
    for(mm <- ints1){
      println(mm)
    }
    println(ints1(ints1.length-1))


    println("---------------------------------------")
    //需求:取出偶数并乘以十并装入新的数组
    //方法1
    val ints3 = for(i<- 0 until arr.length if arr(i)%2==0)yield arr(i)*10
    for(c <-ints3) println(c)
    //方法2
    val ints4 = arr.filter(m=>m%2==0).map(x=>x*10)
    for(c <-ints4)println(c)





  }

}
