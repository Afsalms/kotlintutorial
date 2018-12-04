fun main(args: Array<String>){
var a = args.size

if(a>0){
	var number_entered = args[0]
	if(number_entered != null){
		println("Entered number is $number_entered")
	}
	else{
		println("Please enter a valid interger")
	}
}else{
	
	println("Required parameter is missing")
	}

}
