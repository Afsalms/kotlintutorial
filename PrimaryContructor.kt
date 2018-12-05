fun main(args: Array<String>){
	println("Program for learning the basics of classes and objects in kotlin")
	var a = Person("Firstname", "Lastname")
	println(a.firstName)
	println(a.lastName)
	println(a.getFullName())
	var b = Person(_lastName="Firstname", _firstName="Lastname")
	println(b.firstName)
	println(b.lastName)
	println(b.getFullName())
	//println(b.getName())

}


class Person (var _firstName: String,var  _lastName: String) {
    // Member Variables (Properties) of the class
    var firstName: String = _firstName
    var lastName: String = _lastName

    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }

	fun getFullName() :String{
		return this.firstName + " " + this.lastName
	}
}
