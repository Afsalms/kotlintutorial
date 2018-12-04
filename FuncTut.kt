fun main(args: Array<String>){
println("hello")

fun sum(a: Int, b:Int): Int{
	return a+b
}

fun PrintSum(a: Int, b:Int){
	println("sum of $a and $b is ${a + b}")
}

val a = 1
val b = 2
var result = sum(a,b)
println("result is : " + result)


PrintSum(a, b)
}
