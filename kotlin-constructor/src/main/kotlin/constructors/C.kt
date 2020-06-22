package constructors

class C(nameParam: String) {

    val name: String

    init {
        if (nameParam.isEmpty()) {
            throw IllegalArgumentException("Error")
        }
        this.name = nameParam
    }
}

fun main() {
    val c = C("conas")
    println(c.name)
}