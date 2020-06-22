package constructors

class D(val name: String) {

    var age: Int = 20
    var height: Int = 500

//    컴파일 에러!
//    constructor(name: String, age: Int) {
//        this.age = age
//    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, height: Int) : this(name, age) {
        this.height = height
    }
}

fun main() {
    val d1 = D("conas", 100)
    println("이름: ${d1.name}, 나이: ${d1.age}, 키: ${d1.height}")

    val d2 = D("tmp", 99, 9999)
    println("이름: ${d2.name}, 나이: ${d2.age}, 키: ${d2.height}")
}