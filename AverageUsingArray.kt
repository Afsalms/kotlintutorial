fun main(args: Array<String>){
	println("Program to print the average of array of numbers")
	val a = intArrayOf(1,2,3,4,5)
	val size_of_array = a.size
	var sum = 0.0
	for (i in a){
		sum += i	
	}
	var averge = (sum)/size_of_array
	println("Average : $averge")

}
