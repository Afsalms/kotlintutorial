fun main(args: Array<String>){
	println("Function check number is even or odd")
	var a = 1
	var b = 2
	
	fun odd_or_even(number :Int) :String{
		var reminder = number%2
		if (reminder != 0){
			return "ODD"	
		}
		else{
			return "EVEN"	
		}
	}

	var result  = odd_or_even(a)
	println("$a is $result")
	println("------------------------------------")
	result = odd_or_even(b)
	println("$b is $result")

}
