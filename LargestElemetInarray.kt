fun main(args: Array<String>){
	println("Print prgram to print the largest element in a aray")
	val a: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
	
	var largest = a[0]

	for(i in a){
		if(i>largest){
			largest = i
		}
	}

	println("Larges element in the arrys is $largest")


}
