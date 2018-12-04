fun main(args: Array<String>){
	println("Program to print the ascii of a character")
	var args_len = args.size
	if (args_len > 0){
	var character = args[0].get(0)
	var ascii_val = character.toInt()
	println("Ascii of the character $character is "+ascii_val)
	}
	else{
	println("Mandatory input is missing")
	}
	

}
