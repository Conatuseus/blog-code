package constructors

class E {

    var name: String
    var age: Int = 1
    var height: Int = 2

    init {
        println("call Init Block!")
    }

    constructor(name: String) {
        this.name = name
        println("call Name Constructor!")
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
        println("call Name, Age Constructor!")
    }

    constructor(name: String, age: Int, height: Int) : this(name, age) {
        this.height = height
        println("call Name, Age, Height Constructor!")
    }
}

fun main() {
    val e = E("conas", 100, 200)
}