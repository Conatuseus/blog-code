package data

data class Person(val name:String, val age:Int)

fun main() {
    val p1 = Person("conatuseus",30)
    val p2 = Person("conatuseus",30)

    // == 은 동등성 검사
    println(p1==p2)

    // === 은 같은 인스턴스인지 검사(동일성 확인)
    println(p1===p2)

    println(p1.toString())

    val p3 = p1.copy()
    val p4 = p1.copy(name = "newName",age = 20)
}
