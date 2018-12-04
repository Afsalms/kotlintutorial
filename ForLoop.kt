fun main(args: Array<String>){
	val items = listOf("apple", "banana", "kiwifruite")
	for (item in items){
		println(item)
	}


	println("**********************************************************")
	for(index in items.indices){
		println("item at $index is ${items[index]}")
	}

}
