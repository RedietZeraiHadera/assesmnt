fun main(){
    numbers(1,2,3)
    cut()
    stmt("Rediet","Zeray","Hadera")
    var red = Calculator(12,2)
    red.addition()
    red.subtract()
    red.reminder()
    red.Division()
    com()

}
fun com(){
    var a = "Lyla"
    var b = "Aysan"
    if(a>b){println(b[0])}
    else({println(a[0])})
}
//Q2
fun numbers(num1:Int,num2:Int,num3:Int){
    var number = arrayOf(1,2,3)
    println(number.min())
    println(number.max())
    println(number.average())

}
//Q3
  fun cut(){
  var text = "I, love, chocolate"
    var text2 = text.split(",")
      println(text2[0])
      println(text2[1])
      println(text2[2])

}
//Q5
fun stmt(a:String,b:String,c:String){
    var stat = arrayOf(a,b,c)
    println(stat.contentToString())


}
//Q6
class Calculator(var num1:Int,var num2:Int){
    fun addition(){
       var sum = num1+num2
        println(sum)
    }
    fun subtract(){
        var subtraction = num1-num2
        println(subtraction)
    }
    fun reminder(){
        var remain = num1%num2
        println(remain)
    }
    fun Division(){
        var divide = num1/num2
        println(divide)
    }



}