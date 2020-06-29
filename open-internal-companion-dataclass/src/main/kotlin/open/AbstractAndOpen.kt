package open

abstract class Animal {

    // 추상 메서드는 반드시 override 해야
    abstract fun bark()

    // 이 메서드는 하위 클래스에서 선택적으로 override 할 수 있다. (하거나 안하거나 자유)
    open fun running() {
        println("animal running!")
    }
}

class Dog() : Animal() {

    override fun bark() {
        println("멍멍")
    }

    // 이 메서드는 override 하거나 하지 않거나 자유.
    override fun running() {
        println("dog's running!")
    }
}

