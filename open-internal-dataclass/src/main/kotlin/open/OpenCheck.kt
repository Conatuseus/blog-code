package open

open class Car {

    // 이 메서드는 하위 클래스에서 override 불가능
    fun getNumberOfTires(): Int {
        return 4
    }

    // 하위 클래스에서 override 가능
    open fun hasSunRoof() :Boolean {
        return false
    }
}

// open 클래스는 상속이 가능하다!
class Benz() : Car() {

    // getNumberOfTires 메서드는 override 불가능
    // hasSunRoof 메서드는 open변경자가 붙어서 override 가능
    override fun hasSunRoof(): Boolean {
        return true
    }
}