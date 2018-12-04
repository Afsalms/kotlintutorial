fun main(args: Array<String>){
println("Range function default")
for (x in 1..10){
	println(x)
}
println("------------------------------------------------------")
println("Range function with step")
for (x in 1..10 step 2){
	println(x)
}
println("------------------------------------------------------")

println("Range function invert")
for (x in 9 downTo 0){
	println(x)
}

println("-------------------------------------------------------")
println("Range inverted with step")
for (x in 9 downTo 0 step 2){

	println(x)
}
println("--------------------------------------------------------")
}
