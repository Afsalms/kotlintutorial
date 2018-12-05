fun main(args: Array<String>){
	var capitals = hashMapOf<String, String>()
	capitals.put("Nepal", "Kathmandu")
	capitals.put("India", "New Delhi")
	capitals.put("United States", "Washington")
	capitals.put("England", "London")
	capitals.put("Australia", "Canberra")
	println("**********print using for each ******************")	
	capitals.forEach {println(it)}
	println("-------------------------------------------------")
	for (item in capitals){
		println("Key : " + item.key)
		println("Value: " + item.value)
	}
	var sorted_items = capitals.toList().sortedBy {(_, value) -> value}.toMap()

	println("**************After sorting *************************************")
	sorted_items.forEach {println(it)}

}
