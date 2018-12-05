import java.io.File


fun main(args: Array<String>){
	println("This is program to read the file line by line")

	var file_name = "sample.txt"
	
	fun readFileLineByLine(filename: String)= File(filename).forEachLine {println(it)}

	readFileLineByLine(file_name)

}
