fun main(args: Array<String>){
	println("Program to check a character is vowel or consonant")
	var a = 'A'
	var b = 'B'
	
	fun vowel_or_con(character: Any) = when(character){
	'A', 'a', 'i', 'I', 'e', 'E', 'o', 'O', 'u', 'U' -> "Vowel"
	else -> "Consonant"
	}

	println("$a is ${vowel_or_con(a)}")
	println("$b is ${vowel_or_con(b)}")

}

