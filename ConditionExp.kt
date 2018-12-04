fun main(args: Array<String>){

fun maxof(a: Int, b:Int): Int{
	if (a>b){
			return a
		}
	else{
		return b
	    }
}


var a = 1
var b = 2
var max_va = maxof(a, b)

println("Max of $a and $b is $max_va")
a = 5

max_va = maxof(a, b)

println("Max of $a and $b is $max_va")


}
